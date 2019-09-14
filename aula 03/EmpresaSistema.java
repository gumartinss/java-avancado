import javax.swing.JOptionPane;

public class EmpresaSistema {
    public void adicionar(){

        Empresa proway = new Empresa();

        boolean valido = false;
        do {
            try{
                proway.setRazaoSocial(JOptionPane.showInputDialog(null, "Digite a razão social"));
                valido = true;
            }catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), 
            "AVISO", JOptionPane.ERROR_MESSAGE);
            }
        }while(valido == false);
    
        valido = false;
        do {
            try{
                proway.setCNPJ(JOptionPane.showInputDialog(null, "Digite o CNPJ"));
                valido = true;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "AVISO",
                JOptionPane.ERROR_MESSAGE);
            }
        }while (valido == false);
      
        valido = false;
        do {
            try{
                proway.setFaturamento(Double.parseDouble(JOptionPane
                    .showInputDialog("Digite o valor de faturamento")));
                valido = true;
            }catch(IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "AVISO",
                JOptionPane.ERROR_MESSAGE);
            }
        }while(valido == false);


        System.out.println(
            "Razão Social: " + proway.getRazaoSocial() +
            "\nCNPJ: " + proway.getCNPJ() +
            "\nFaturamento: " + proway.getFaturamento()
            );
    }    
}       