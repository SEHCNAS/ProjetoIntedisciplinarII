package ProjetoInterdisciplinar_II;

public class Veiculo {

    //Declaração das variaveis
    private int QuantidadeDisponivel, Identificador;
    private String Modelo, Marca, Estado, TipoVeiculo, Cor;
    private Double Kilometragem, Valor;

    //Getter e Setter

    public int getQuantidadeDisponivel() {
        return QuantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        QuantidadeDisponivel = quantidadeDisponivel;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int identificador) {
        Identificador = identificador;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }

    public String getCor(){
        return Cor;
    }

    public void setCor(String Cor){
        this.Cor = Cor;
    }

    public Double getKilometragem() {
        return Kilometragem;
    }

    public void setKilometragem(Double kilometragem) {
        Kilometragem = kilometragem;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    //Funções

    public String RetornaDadosVeiculo(){
        return "Marca: " + this.Marca + ", Modelo: " + this.Modelo + ", Tipo: " + this.TipoVeiculo;
    }

  /*  void RealizarVenda(){
        this.QuantidadeDisponivel -= 1;
    }

    void AumentarQuantidadeVeiculo(int QuantidadeAdicional){
        this.QuantidadeDisponivel += QuantidadeAdicional;
    }
    */
}
