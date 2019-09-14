import javax.swing.JOptionPane;

public class ProdutoPrincipal {

    public static void main(String[] args) {
        
        Produto xbox = new Produto();
        
        // Defini as informações 
        xbox.setNome("Xbox");
        xbox.setQuantidade(3);

        // Obtém as informações guardadas préviamente
        JOptionPane.showMessageDialog(null,
            "Nome: " + xbox.getNome() + 
            "\nQuantidade: " + xbox.getQuantidade()
        );
            
    }    
}