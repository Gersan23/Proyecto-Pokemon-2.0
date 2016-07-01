/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.RegistroEntrenador;

/**
 *
 * @author Gersan
 */
public class VentanaBatalla extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBatalla
     */
    public VentanaBatalla() {
        initComponents();
        this.setTitle("Batalla");
        setSize(650,340);
        setLocationRelativeTo(null);
        RegistroEntrenador array = new RegistroEntrenador();
    }
    
    
    public void llenarComboBox(RegistroEntrenador array) {//llenar la lista de combobox
        jComboBoxJugadores.removeAllItems();
        for(int i = 0; i < array.getTamano(); i++) {
                jComboBoxJugadores.addItem(array.getObjeto(i).getUsuario());
        }
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_Pokemon1 = new javax.swing.JLabel();
        jL_Pokedex = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Chat = new javax.swing.JTextArea();
        jL_Ataque1 = new javax.swing.JLabel();
        jL_AtaqueR1 = new javax.swing.JLabel();
        jL_AtaqueR2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxJugadores = new javax.swing.JComboBox<>();
        jLabelEntrenadores = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);
        getContentPane().add(jL_Pokemon1);
        jL_Pokemon1.setBounds(132, 73, 81, 66);
        getContentPane().add(jL_Pokedex);
        jL_Pokedex.setBounds(397, 73, 83, 66);

        jT_Chat.setColumns(20);
        jT_Chat.setRows(5);
        jScrollPane1.setViewportView(jT_Chat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(46, 193, 542, 78);

        jL_Ataque1.setText("Ataque:");
        getContentPane().add(jL_Ataque1);
        jL_Ataque1.setBounds(76, 161, 38, 15);

        jL_AtaqueR1.setText("0");
        getContentPane().add(jL_AtaqueR1);
        jL_AtaqueR1.setBounds(150, 160, 44, 15);

        jL_AtaqueR2.setText("0");
        getContentPane().add(jL_AtaqueR2);
        jL_AtaqueR2.setBounds(397, 161, 44, 15);

        jLabel1.setText("Ataque:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(482, 161, 38, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokemon_x_and_y_battle_background_10_by_phoenixoflight92-d843fov.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 630, 300);

        jComboBoxJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxJugadores);
        jComboBoxJugadores.setBounds(50, 50, 180, 24);

        jLabelEntrenadores.setText("Entrenadores");
        getContentPane().add(jLabelEntrenadores);
        jLabelEntrenadores.setBounds(50, 20, 180, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxJugadoresActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaBatalla().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxJugadores;
    private javax.swing.JLabel jL_Ataque1;
    private javax.swing.JLabel jL_AtaqueR1;
    private javax.swing.JLabel jL_AtaqueR2;
    private javax.swing.JLabel jL_Pokedex;
    private javax.swing.JLabel jL_Pokemon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEntrenadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jT_Chat;
    // End of variables declaration//GEN-END:variables
}
