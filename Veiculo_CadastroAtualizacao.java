package ProjetoInterdisciplinar_II;

import java.util.Objects;
import java.util.Scanner;

public class Veiculo_CadastroAtualizacao {

    static String RetonaTipoVeiculo(int IdentificadorVeiculo){
        return switch (IdentificadorVeiculo) {
            case 1 -> "Moto";
            case 2 -> "Carro";
            case 3 -> "Caminhao";
            default -> throw new IllegalStateException("Unexpected value: " + IdentificadorVeiculo);
        };
    }

    static void CadastraAtualizaVeiculo(String mode, Veiculo Veiculo, int ItemAtualizar){
        Scanner sc = new Scanner(System.in);
        int TipoVeiculo = 0;
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 1 || ItemAtualizar == 0))) {
            System.out.println("Digite a marca do veiculo: ");
            Veiculo.setMarca(sc.next());
        }
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 2 || ItemAtualizar == 0))) {
            System.out.println("Digite o Modelo do veiculo: ");
            Veiculo.setModelo(sc.next());
        }
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 3 || ItemAtualizar == 0))) {
            System.out.println("Digite o estado do veiculo: ");
            Veiculo.setEstado(sc.next());
        }
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 4 || ItemAtualizar == 0))) {
            System.out.println("Digite a cor do veiculo: ");
            Veiculo.setCor(sc.next());
        }
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 5 || ItemAtualizar == 0))) {
            System.out.println("Digite o numero referente ao tipo do veiculo (1)-MOTO, (2)-CARRO e (3)-CAMINHÃO: ");
            while ((TipoVeiculo != 1) && (TipoVeiculo != 2) && (TipoVeiculo != 3)) {
                TipoVeiculo = sc.nextInt();

            }

            Veiculo.setTipoVeiculo(RetonaTipoVeiculo(TipoVeiculo));
        }
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 6 || ItemAtualizar == 0))) {
            System.out.println("Digite o valor do veiculo: ");
            Veiculo.setValor(sc.nextDouble());
        }
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 7 || ItemAtualizar == 0))) {
            System.out.println("Digite a kilometragem do veiculo: ");
            Veiculo.setKilometragem(sc.nextDouble());
        }
        if((Objects.equals(mode, "INS")) || ((Objects.equals(mode, "UPD")) && (ItemAtualizar == 8 || ItemAtualizar == 0))) {
            System.out.println("Digite a quantidade de veiculos disponiveis: ");
            Veiculo.setQuantidadeDisponivel(sc.nextInt());
        }
        if(Objects.equals(mode, "INS")) {
            Main.ListaVeiculos.add(Veiculo);
        }
    }
}
