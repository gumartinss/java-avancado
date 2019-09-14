import javax.swing.JOptionPane;

public class ColaboradorPrincipal {

    public static void main(String[] args) {

        Colaborador colaborador = new Colaborador();

        colaborador.setCodigo(00010);
        colaborador.setNome("Gustavo");
        colaborador.setValorHora(50);
        colaborador.setQuantidade(100);

        JOptionPane.showMessageDialog(null,
            "Codigo: " + colaborador.getCodigo() + 
            "\nNome: " + colaborador.getNome() + 
            "\nValor Hora: " + colaborador.getValorHora() + 
            "\nQuantidade: " + (colaborador.getQuantidade() * colaborador.getValorHora())
        );        
    }    
}