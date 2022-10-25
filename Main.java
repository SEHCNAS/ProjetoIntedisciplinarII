package ProjetoInterdisciplinar_II;
/*Sistema de venda para concessionária (carro, caminhão, moto)*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Veiculo> ListaVeiculos = new ArrayList<>();

    public static void mensagemOpcao(int OpcaoMensagem) {
        switch (OpcaoMensagem) {
            case 1 -> System.out.println("""
                    Opções disponiveis.
                     1 - Ver lista de veiculos cadastrados
                     2 - Cadastrar novo veiculo\s
                     3 - Editar Registro
                     4 - Excluir Resgitro
                     0 - Sair""");
            case 2 -> System.out.println("""
                    Digite o numero do campo que deseja atualizar.
                     1 - Marca
                     2 - Modelo\s
                     3 - Estado
                     4 - Cor
                     5 - Tipo do veiculo
                     6 - Valor
                     7 - Kilometragem
                     8 - Quantidade disponivel
                     0 - Todos os campos
                     """);
        }

    }

    public static void main(String[] args) {
        // Declaração de variaveis
        Scanner sc = new Scanner(System.in);
        int MenuEscolha, contador, ItemAtualizar, indexDoVeliculo;
        Veiculo Veiculo;

        // Inicialização de variaveis
        MenuEscolha = 1;
        contador = 0;

        while (MenuEscolha > 0) {

            if (contador == 0) {
                // Mensagem com as opções do menu
                mensagemOpcao(1);
                contador = 3;
            } /* Mostra as opções disponiveis a cada 3 tentativas do usuario */
            contador -= 1;

            System.out.println("Digite o numero correspondente a opção que deseja acessar: ");
            MenuEscolha = sc.nextInt();

            switch (MenuEscolha) {

                case 1: /* Lista de veiculos cadastrados */

                    /* System.out.println("Opção 1"); */
                    if (ListaVeiculos.isEmpty()) {
                        System.out.println("Ainda não foi cadastrado nenhum item para venda!");
                    } else {
                        VeiculoLista.listaFiltro(ListaVeiculos);
                    }
                    break;

                case 2: /* Cadastro de novos veiculos */

                    Veiculo = new Veiculo();
                    Veiculo_CadastroAtualizacao.CadastraAtualizaVeiculo("INS", Veiculo, 0);
                    break;

                case 3:/* Editar um item */

                    if (ListaVeiculos.isEmpty()) {
                        System.out.println("Ainda não foi cadastrado nenhum item para venda!");
                    } else {
                        VeiculoLista.listaFiltro(ListaVeiculos);
                        System.out.println("Digite o id do item que deseja editar: ");
                        indexDoVeliculo = sc.nextInt();

                        mensagemOpcao(2);
                        ItemAtualizar = sc.nextInt();
                        Veiculo_CadastroAtualizacao.CadastraAtualizaVeiculo("UPD", ListaVeiculos.get(indexDoVeliculo), ItemAtualizar);
                    }
                    break;

                case 4:/* Exluir um item */

                    if (ListaVeiculos.isEmpty()) {
                        System.out.println("Ainda não foi cadastrado nenhum item para venda!");
                    } else {
                        Veiculo_CadastroAtualizacao.ExcluirVeiculo();
                    }
                    break;

                case 0:
                    MenuEscolha = 0;
                    break;

                default:
                    System.out.println("Opção invalida tente novamente!");
            }
        }
        sc.close();
    }
}