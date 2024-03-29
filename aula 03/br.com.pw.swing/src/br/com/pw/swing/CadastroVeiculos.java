/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pw.swing;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 65772
 */
public class CadastroVeiculos extends javax.swing.JFrame {
    
    private int codigo = 0;
    private boolean editando = false;
    private int linhasSelecionada = -1; 
    /**
     * Creates new form CadastroVeiculos
     */
    public CadastroVeiculos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jTextFieldModelo = new javax.swing.JTextField();
        jComboBoxAno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonPreto = new javax.swing.JRadioButton();
        jRadioButtonBranco = new javax.swing.JRadioButton();
        jRadioButtonVermelho = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxBatido = new javax.swing.JCheckBox();
        jFormattedTextFieldKm = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Cadastro de Veiculos");

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peugeot", "BMW", "Renault" }));
        jComboBoxMarca.setSelectedIndex(-1);
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });

        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        jComboBoxAno.setSelectedIndex(-1);
        jComboBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Cor");

        buttonGroup1.add(jRadioButtonPreto);
        jRadioButtonPreto.setText("Preto");

        buttonGroup1.add(jRadioButtonBranco);
        jRadioButtonBranco.setText("Branco");

        buttonGroup1.add(jRadioButtonVermelho);
        jRadioButtonVermelho.setText("Vermelho");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Batido");

        try {
            jFormattedTextFieldKm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###Km")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldKmActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Modelo");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Ano");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Km Rodado");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Ano", "Cor", "Batido", "Km Rodado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Carros Cadastrados");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRadioButtonBranco)
                                                    .addComponent(jRadioButtonPreto)
                                                    .addComponent(jRadioButtonVermelho)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBoxBatido)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(162, 162, 162))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButtonCadastrar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jFormattedTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jRadioButtonPreto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonBranco)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addComponent(jRadioButtonVermelho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxBatido)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAnoActionPerformed

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       linhasSelecionada = jTable.getSelectedRow();
       if(linhasSelecionada == -1){
           JOptionPane.showMessageDialog(this, "Selecione uma linha");
           return;
       }
       
       editando = true;
       String marca = jTable.getValueAt(linhasSelecionada, 0).toString();
       String modelo = jTable.getValueAt(linhasSelecionada, 1).toString();
       int ano = Integer.parseInt(jTable.getValueAt(linhasSelecionada, 2).toString());
       String textoCor = jTable.getValueAt(linhasSelecionada, 3).toString();
       boolean batido = Boolean.parseBoolean(jTable.getValueAt(linhasSelecionada, 4).toString());
       int Km = Integer.parseInt(jTable.getValueAt(linhasSelecionada, 5).toString());
       
       jComboBoxMarca.setSelectedItem(marca);
       jTextFieldModelo.setText(modelo);
       jComboBoxAno.setSelectedItem(ano);
       jFormattedTextFieldKm.setValue(Km);
       jCheckBoxBatido.setSelected(batido);
       jRadioButtonPreto.setSelected(false);
       jRadioButtonBranco.setSelected(false);
       jRadioButtonVermelho.setSelected(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        int posicaoLinhaSelecionada = jTable.getSelectedRow();
       if(posicaoLinhaSelecionada == -1){
           JOptionPane.showMessageDialog(this, "Selecione Uma Linha");
           return;
       }    
       
       int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente apagar ?", "AVISO",
               JOptionPane.YES_NO_OPTION);
       if(opcao == JOptionPane.YES_OPTION){
           DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
           modelo.removeRow(posicaoLinhaSelecionada);
           JOptionPane.showMessageDialog(this, "Registro apagado com sucesso");
       }          
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String marca = jComboBoxMarca.getSelectedItem().toString();
        String modelo = jTextFieldModelo.getText();
        int ano = Integer.parseInt(jComboBoxAno.getSelectedItem()
                .toString()
                .replace(" ", " ")
        );
        int Km = Integer.parseInt(jFormattedTextFieldKm.getValue()
                .toString()
                .replace("Km","")
                .replace(" "," ")
               
        );
        boolean batido = false;
        String textoBatido = "Não";
        if(jCheckBoxBatido.isSelected() == true){
            batido = true;
            textoBatido = "Sim";
        }
        
        String textoCor = "";
        if(jRadioButtonPreto.isSelected()){
            textoCor = "Preto";
        }else if(jRadioButtonBranco.isSelected()){
            textoCor = "Branco";
        }else if(jRadioButtonVermelho.isSelected()){
            textoCor = "Vermelho";
        }
        
        DefaultTableModel modelo1 = (DefaultTableModel) jTable.getModel();
        
        if(editando == false){
            codigo = codigo + 1;
            modelo1.addRow(new Object[]{
               marca, modelo, ano, textoCor, batido, Km
            });
        }else{
            jTable.setValueAt(marca, linhasSelecionada,  0);
            jTable.setValueAt(modelo, linhasSelecionada, 1);
            jTable.setValueAt(ano, linhasSelecionada, 2);
            jTable.setValueAt(textoCor, linhasSelecionada, 3);
            jTable.setValueAt(batido, linhasSelecionada, 4);
            jTable.setValueAt(Km, linhasSelecionada, 5);
            linhasSelecionada = -1;
            editando = false;
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jFormattedTextFieldKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldKmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JCheckBox jCheckBoxBatido;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JFormattedTextField jFormattedTextFieldKm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonBranco;
    private javax.swing.JRadioButton jRadioButtonPreto;
    private javax.swing.JRadioButton jRadioButtonVermelho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables
}
