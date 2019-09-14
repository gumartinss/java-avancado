public class Produto {

    private String nome;
    private int quantidade;

    // set -> definir ou atribuir
    public void setNome(String nome){
        this.nome = nome;

    }

    // get -> obter a informação
    public String getNome() {
        return nome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }
}