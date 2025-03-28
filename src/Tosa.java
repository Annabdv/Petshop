public class Tosa extends ServicoPetshop {

    public Tosa(int codigo, TamanhoDoAnimal tamanhoAnimal) {
        super(codigo, tamanhoAnimal);
    }

    @Override
    public double calculaPreco() {
        if (getTamanhoAnimal() == TamanhoDoAnimal.PEQUENO) {
            return 30.00;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.MEDIO) {
            return 40.00;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.GRANDE) {
            return 50.00;
        } else {
            throw new IllegalArgumentException("Tamanho do animal inválido.");
        }
    }

    @Override
    public String getDescricao() {
        return "Tosa para animal de " + getTamanhoAnimal() + ". Preço: R$ " + calculaPreco();
    }
}
