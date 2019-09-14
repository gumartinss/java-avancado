public class Colaborador {

    private int codigo;
    private String nome;
    private double valorhora;
    private int quantidade;
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }



    public void setValorHora(double valorhora) {
        this.valorhora = valorhora;
    }

    public double getValorHora() {
        return valorhora;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}