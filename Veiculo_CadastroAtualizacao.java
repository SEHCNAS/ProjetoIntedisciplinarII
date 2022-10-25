package ProjetoInterdisciplinar_II;

import java.util.Objects;
import java.util.Scanner;

public class Veiculo_CadastroAtualizacao {
    static Scanner sc = new Scanner(System.in);

    static String RetonaTipoVeiculo(int IdentificadorVeiculo) {
        return switch (IdentificadorVeiculo) {
            case 1 -> "Moto";
            case 2 -> "Carro";
            case 3 -> "Caminhão";
            default -> throw new IllegalStateException("Unexpected value: " + IdentificadorVeiculo);
        };
    }

    static void CadastraAtualizaVeiculo(String mode, Veiculo Veiculo, int ItemAtualizar) {
        int TipoVeiculo = 0;
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 1 || ItemAtualizar == 0))) {
            System.out.println("Digite a marca do veiculo: ");
            Veiculo.setMarca(sc.next());
        }
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 2 || ItemAtualizar == 0))) {
            System.out.println("Digite o Modelo do veiculo: ");
            Veiculo.setModelo(sc.next());
        }
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 3 || ItemAtualizar == 0))) {
            System.out.println("Digite o estado do veiculo: ");
            Veiculo.setEstado(sc.next());
        }
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 4 || ItemAtualizar == 0))) {
            System.out.println("Digite a cor do veiculo: ");
            Veiculo.setCor(sc.next());
        }
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 5 || ItemAtualizar == 0))) {
            while ((TipoVeiculo != 1) && (TipoVeiculo != 2) && (TipoVeiculo != 3)) {
                System.out.println("Digite o numero referente ao tipo do veiculo (1)-MOTO, (2)-CARRO e (3)-CAMINHÃO: ");
                TipoVeiculo = sc.nextInt();
            }

            Veiculo.setTipoVeiculo(RetonaTipoVeiculo(TipoVeiculo));
        }
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 6 || ItemAtualizar == 0))) {
            System.out.println("Digite o valor do veiculo: ");
            Veiculo.setValor(sc.nextDouble());
        }
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 7 || ItemAtualizar == 0))) {
            System.out.println("Digite a kilometragem do veiculo: ");
            Veiculo.setKilometragem(sc.nextDouble());
        }
        if ((Objects.equals(mode, "INS"))
                || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 8 || ItemAtualizar == 0))) {
            System.out.println("Digite a quantidade de veiculos disponiveis: ");
            Veiculo.setQuantidadeDisponivel(sc.nextInt());
        }
        if (Objects.equals(mode, "INS")) {
            Main.ListaVeiculos.add(Veiculo);
        }
    }

    static void ExcluirVeiculo() {
        VeiculoLista.listaFiltro(Main.ListaVeiculos);
        System.out.println("Digite o id do item que deseja Excluir: ");
        int itemExcluir = sc.nextInt();
        if ((itemExcluir < 0) || (itemExcluir >= Main.ListaVeiculos.size())) {
            System.out.println("ID inválido");
        } else {
            Main.ListaVeiculos.remove(itemExcluir);
            System.out.println("Registro excluido com sucesso");
        }
    }

}
