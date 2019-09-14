import javax.swing.JOptionPane;

public class AlunoSistema {
    public void adicionar(){

        Aluno aluno = new Aluno();

        boolean valido = false;
        do{
            try{
                aluno.setNome(JOptionPane.showInputDialog( "Digite o seu nome"));
                valido = true;
            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            }

        }while(valido == false);

        valido = false;
        do{
            try{
                aluno.setSobreNome(JOptionPane.showInputDialog(null, "Digite o seu SobreNome"));
                valido = true;
            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            }

        }while(valido == false);

        valido = false;
        do{
            try{
                aluno.setNota(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua Nota")));
                valido = true;
            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            }

        }while(valido == false);

        System.out.println(
            "Nome: " + aluno.getNome() + 
            "\nSobreNome: " + aluno.getSobreNome() + 
            "\nNota: " + aluno.getNota()
        );
    }
}