import java.util.Scanner;

public class AtendimentoPetshop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo ao atendimento do Petshop!");
        System.out.println("Oferecemos aos animais serviços de Banho, Tosa e Hotelzinho.");
        System.out.println("O que gostaria de fazer? Por favor, informe o código de serviço: ");
        System.out.println("Digite 0 - para fechar a loja");
        System.out.println("Digite 1 - para Banho");
        System.out.println("Digite 2 - para Hotelzinho");
        System.out.println("Digite 3 - para Tosa.");

        int cod = sc.nextInt();

        if (cod == 0) {
            System.out.println("Fechando a loja...");
        } else {
            System.out.println("Para qual tamanho de animal você está solicitando o serviço?");
            System.out.println("Digite 1 - para Pequeno");
            System.out.println("Digite 2 - para Médio");
            System.out.println("Digite 3 - para Grande");

            int tamanhoAnimalInput = sc.nextInt();
            TamanhoDoAnimal tamanhoAnimal = TamanhoDoAnimal.values()[tamanhoAnimalInput - 1];

            String tamanhoPeloString = "";
            TamanhoPelo tamanhoPelo = null;

            if (cod == 1) {
                System.out.println("Agora, informe o tamanho do pelo do animal:");
                System.out.println("Digite 1 - para Curto");
                System.out.println("Digite 2 - para Médio");
                System.out.println("Digite 3 - para Longo");

                int peloInput = sc.nextInt();

                if (peloInput == 1) tamanhoPelo = TamanhoPelo.CURTO;
                else if (peloInput == 2) tamanhoPelo = TamanhoPelo.MEDIO;
                else if (peloInput == 3) tamanhoPelo = TamanhoPelo.LONGO;
            }

            ServicoPetshop servico = null;

            if (cod == 1) {
                servico = new Banho(1, tamanhoAnimal, tamanhoPelo);
            } else if (cod == 2) {
                System.out.print("Quantas horas o animal ficará no hotelzinho? ");
                int qtdeHoras = sc.nextInt();
                servico = new Hotelzinho(2, tamanhoAnimal, qtdeHoras);
            } else if (cod == 3) {
                servico = new Tosa(3, tamanhoAnimal);
            }


            if (servico != null) {
                System.out.println("Serviço: " + servico.getDescricao());
            }
        }

        sc.close();
    }
}