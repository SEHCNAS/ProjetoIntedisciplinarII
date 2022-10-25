package ProjetoInterdisciplinar_II;

import java.util.List;
import java.util.Scanner;

public class VeiculoLista {

    // Função de listar o tipo do Veiculo informado
    static void listarVeiculo(List<Veiculo> ListaVeiculos, String tipoVeiculo) {
        // Inicialização de variaveis
        int Contador = 0;
        for (Veiculo veiculo : ListaVeiculos) {
            if (veiculo.getTipoVeiculo().equals(tipoVeiculo) || tipoVeiculo.equals("Todos")) {
                System.out.printf("%d - %s%n", ListaVeiculos.indexOf(veiculo), veiculo.RetornaDadosVeiculo());
                Contador++;
            }
        }
        if (Contador == 0) {
            System.out.print("Nenhum.\n");
        }
    }

    static void listaFiltro(List<Veiculo> ListaVeiculos) {
        // Declaração de variaveis
        Scanner sc = new Scanner(System.in);

        // Inicialização de variaveis
        int MenuEscolha = 1;
        System.out.println("""
                Ver lista de veiculos cadastrados
                Opções disponiveis.
                 1 - Todos
                 2 - Moto \s
                 3 - Carro
                 4 - Caminhão""");

        while (MenuEscolha > 0) {
            System.out.println("Digite o numero correspondente a opção que deseja acessar: ");
            MenuEscolha = sc.nextInt();

            switch (MenuEscolha) {
                case 1 -> /* Lista Todos os veiculos cadastrados */
                        listarVeiculo(ListaVeiculos, "Todos");
                case 2 -> {// Moto
                    listarVeiculo(ListaVeiculos, "Moto");
                    MenuEscolha = 0;
                }
                case 3 -> {// Carro
                    listarVeiculo(ListaVeiculos, "Carro");
                    MenuEscolha = 0;
                }
                case 4 -> {// Caminão
                    listarVeiculo(ListaVeiculos, "Caminhão");
                    MenuEscolha = 0;
                }
                default -> System.out.println("Opção invalida tente novamente!");
            }
        }
    }
}
