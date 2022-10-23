package ProjetoInterdisciplinar_II;

import java.util.List;
import java.util.Scanner;

public class VeiculoLista {
    /* Lista todos os veiculos cadastrados */
    static void Lista(List<Veiculo> ListaVeiculos) {
        // Inicialização de variaveis
        int Contador = 0;
        for (Veiculo veiculo : ListaVeiculos) {
            System.out.printf("%d - %s%n", Contador, veiculo.RetornaDadosVeiculo());
            Contador++;
        }
    }

    static void listaFiltro(List<Veiculo> ListaVeiculos) {
        // Declaração de variaveis
        Scanner sc = new Scanner(System.in);

        // Inicialização de variaveis
        int MenuEscolha = 1;
        int Contador = 0;
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
                case 1: /* Lista Todos os veiculos cadastrados */
                    Lista(ListaVeiculos);

                case 2:// Moto
                    for (Veiculo veiculo : ListaVeiculos) {
                        if (veiculo.getTipoVeiculo().equals("Moto")) {
                            System.out.printf("%d - %s%n", Contador, veiculo.RetornaDadosVeiculo());
                            Contador++;
                        }
                    }
                    if (Contador == 0) {
                        System.out.printf("Nenhum.\n");
                    }
                    MenuEscolha = 0;
                    break;

                case 3:// Carro
                    for (Veiculo veiculo : ListaVeiculos) {
                        if (veiculo.getTipoVeiculo().equals("Carro")) {
                            System.out.printf("%d - %s%n", Contador, veiculo.RetornaDadosVeiculo());
                            Contador++;
                        }
                    }
                    if (Contador == 0) {
                        System.out.printf("Nenhum.\n");
                    }
                    MenuEscolha = 0;
                    break;

                case 4:// Caminão
                    for (Veiculo veiculo : ListaVeiculos) {
                        if (veiculo.getTipoVeiculo().equals("Caminhão")) {
                            System.out.printf("%d - %s%n", Contador, veiculo.RetornaDadosVeiculo());
                            Contador++;
                        }
                    }
                    if (Contador == 0) {
                        System.out.printf("Nenhum.\n");
                    }
                    MenuEscolha = 0;
                    break;

                default:
                    System.out.println("Opção invalida tente novamente!");
            }
        }
    }
}
