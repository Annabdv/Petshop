public class Hotelzinho extends ServicoPetshop {
    private int qtdeHoras;

    public Hotelzinho(int codigo, TamanhoDoAnimal tamanhoAnimal, int qtdeHoras) {
        super(codigo, tamanhoAnimal);
        this.qtdeHoras = qtdeHoras;
    }

    @Override
    public double calculaPreco() {
        double precoBase = 0.0;
        if (getTamanhoAnimal() == TamanhoDoAnimal.PEQUENO) {
            precoBase = 12.0;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.MEDIO) {
            precoBase = 18.0;
        } else if (getTamanhoAnimal() == TamanhoDoAnimal.GRANDE) {
            precoBase = 25.0;
        }

        return precoBase * qtdeHoras;
    }

    @Override
    public String getDescricao() {
        return "Hotelzinho para animal de " + getTamanhoAnimal() + " porte, por " + qtdeHoras + " horas. Preço: R$ " + calculaPreco();
    }
}