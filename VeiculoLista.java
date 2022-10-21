package ProjetoInterdisciplinar_II;

import java.util.List;
public class VeiculoLista {
    /*Lista todos os veiculos cadastrados*/
    static void Lista(List<Veiculo> ListaVeiculos){
        int Contador = 0;
        for (Veiculo Veiculo : ListaVeiculos) {
           System.out.printf("%d - %s%n", Contador, Veiculo.RetornaDadosVeiculo());
           Contador++;
        }
    }

}
