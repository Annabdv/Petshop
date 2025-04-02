public class FachadaPetshop {
    private InventarioPetshop inventarioPetshop;

    private void addBanho(int codigo, TamanhoDoAnimal tamanhoDoAnimal, TamanhoPelo tamanhoPelo) {
        Banho banho = new Banho(codigo, tamanhoDoAnimal, tamanhoPelo);
        inventarioPetshop.adicionaServico(banho);
    }

    private void addHotelzinho(int codigo, TamanhoDoAnimal tamanhoDoAnimal, int qtdeHoras) {
        Hotelzinho hotelzinho = new Hotelzinho(codigo, tamanhoDoAnimal, qtdeHoras);
        inventarioPetshop.adicionaServico(hotelzinho);
    }

    private void addTosa(int codigo, TamanhoDoAnimal tamanhoDoAnimal) {
        Tosa tosa = new Tosa(codigo, tamanhoDoAnimal);
        inventarioPetshop.adicionaServico(tosa);
    }

    public double calculaServico() {
        return inventarioPetshop.calculaValorServico();
    }

    //terminar fachada
}
