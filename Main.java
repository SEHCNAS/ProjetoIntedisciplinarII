package ProjetoInterdisciplinar_II;
/*Sistema de venda para concessionária (carro, caminhão, moto)*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Veiculo> ListaVeiculos = new ArrayList<>();

    public static void main(String[] args){
        //Declaração de variaveis
        Scanner sc = new Scanner(System.in);
        int MenuEscolha;
        Veiculo Veiculo;
        List<Veiculo> ListaVeiculos = new ArrayList<>();

        //Inicialização de variaveis
        MenuEscolha = 1;

        //Mensagem com as opções do menu
        System.out.println("""
                Opções disponiveis.
                 1 - Ver lista de veiculos cadastrados
                 2 - Cadastrar novo veiculo\s
                 3 - Editar Registro
                 0 - Sair""");

        while (MenuEscolha > 0){

            System.out.println("Digite o numero correspondente a opção que deseja acessar: ");
            MenuEscolha = sc.nextInt();

            switch (MenuEscolha) {

                case 1: /*Lista de veiculos cadastrados*/
                    /*System.out.println("Opção 1");*/
                    if (ListaVeiculos.isEmpty()) {
                        System.out.println("Ainda não foi cadastrado nenhum item para venda!");
                    } else {
                        VeiculoLista.Lista(ListaVeiculos);
                    }
                    break;

                case 2: /*Cadastro de novos veiculos*/

                    Veiculo = new Veiculo();
                    Veiculo_CadastroAtualizacao.CadastraAtualizaVeiculo("INS", Veiculo, 0);
                    break;

                case 3:/*Editar um item*/

                    if (ListaVeiculos.isEmpty()) {
                        System.out.println("Ainda não foi cadastrado nenhum item para venda!");
                    } else {
                        VeiculoLista.Lista(ListaVeiculos);
                        System.out.println("Digite o id do item que deseja editar: ");
                        Veiculo_CadastroAtualizacao.CadastraAtualizaVeiculo("UPD", ListaVeiculos.get(sc.nextInt()), 1);
                    }
                    break;

                case 0:
                    MenuEscolha = 0;
                    break;

                default:
                    System.out.println("Opção invalida tente novamente!");
            }
        }
    }

}

