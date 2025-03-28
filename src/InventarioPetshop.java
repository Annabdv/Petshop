import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {
    private List<ServicoPetshopIF> servicos = new ArrayList<>();

    public int adicionaServico(ServicoPetshopIF servico){
        servicos.add(servico);
        return servicos.indexOf(servico);
    }

    public double calculaValorServico() {
        double valor  = 0;
        for (ServicoPetshopIF servico : servicos) {
            valor += servico.calculaPreco();
        }
        return valor;
    }

    public String listaServico(){
        String lista = "";
        for(ServicoPetshopIF servico : servicos){
            lista += servico.getDescricao() + "\n";
        }
        return lista;
    }
}