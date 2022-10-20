package ProjetoInterdisciplinar_II;
/*Sistema de venda para concessionária (carro, caminhão, moto)*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /*Teste para ser usado no cadastro*/
    public enum TiposVeiculos {
        CAMINHAO(3,"CAMINHAO"),
        CARRO(2,"CARRO"),
        MOTO(1,"MOTO");

        private final int valor;
        private final String descricao;

        TiposVeiculos(int valor, String descricao) {
            this.valor = valor;
            this.descricao = descricao;
        }

        public int getValor() {
            return this.valor;
        }
        public String getDescricao() {
            return this.descricao;
        }


    }

    public static void main(String[] args){
        //Declaração de variaveis
        int MenuEscolha;
        Veiculo Veiculo;
        List<Veiculo> ListaVeiculos = new ArrayList<Veiculo>();
        Scanner sc = new Scanner(System.in);

        //Inicialização de variaveis
        MenuEscolha = 1;

        //Mensagem com as opções do menu
        System.out.println("Opções disponiveis." +
                "\n 1 - Ver lista de veiculos cadastrados" +
                "\n 2 - Cadastrar novo veiculo " +
                "\n 0 - Sair");

        while (MenuEscolha > 0){

            System.out.println("Digite o numero correspondente a opção que deseja acessar: ");
            MenuEscolha = sc.nextInt();

            switch (MenuEscolha) {

                case 1: /*Lista de veiculos cadastrados*/
                    /*System.out.println("Opção 1");*/
                    if (ListaVeiculos.isEmpty()){
                        System.out.println("Ainda não foi cadastrado nenhum item para venda!");
                    }else{

                        /*Função lambda para percorrer a coleção*/
                        ListaVeiculos.forEach(Veiculo2 ->{
                            /*Criar função listarCaracteristica*/
                            System.out.println(Veiculo2.RetornaDadosVeiculo());
                        });
                    }
                    break;

                case 2: /*Cadastro de novos veiculos*/
                    /*System.out.println("Opção 2");*/

                    Veiculo = new Veiculo();

                    System.out.println("Digite a marca do veiculo: ");
                    Veiculo.setMarca(sc.next());

                    ListaVeiculos.add(Veiculo);
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
