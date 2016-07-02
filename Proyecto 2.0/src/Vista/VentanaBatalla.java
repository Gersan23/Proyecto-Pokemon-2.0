/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.VectorPokemon;
import Modelo.RegistroEntrenador;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.ScrollPaneConstants;
import Controlador.ClientePrivado;
import Modelo.ServerPrivado;
import Controlador.HiloServer;
import Controlador.ControladorVentanaBatalla;
import javax.swing.JTextField;

/**
 *
 * @author Gersan
 */
public class VentanaBatalla extends javax.swing.JFrame {
    private VectorPokemon pokemonVect;
    private ControladorVentanaBatalla control;
    
    /**
     * Creates new form VentanaBatalla
     */
    ClientePrivado cliente;
    public VentanaBatalla() {
        initComponents();
        this.setTitle("Batalla");
        setSize(650,340);
        setLocationRelativeTo(null);
        cliente= new ClientePrivado(jT_Chat);
        Thread hilo = new Thread(cliente);
        hilo.start();
        RegistroEntrenador array = new RegistroEntrenador();
        control = new ControladorVentanaBatalla(this, array);
        jBListo.addActionListener(control);
        jButton1.addActionListener(control);
        
    }
    
    
    public void llenarComboBox(RegistroEntrenador array) {//llenar la lista de combobox
        jComboBoxJugadores.removeAllItems();
        for(int i = 0; i < array.getTamano(); i++) {
                jComboBoxJugadores.addItem(array.getObjeto(i).getUsuario());
        }
    }    

    public JComboBox getjComboBoxJugadores() {
        return jComboBoxJugadores;
    }

    public JLabel getjL_AtaqueR1() {
        return jL_AtaqueR1;
    }

    public JLabel getjL_AtaqueR2() {
        return jL_AtaqueR2;
    }

    public JLabel getjL_Pokemon1() {
        return jL_Pokemon1;
    }

    public JLabel getjL_Pokemon2() {
        return jL_Pokemon2;
    }

    public void setjL_AtaqueR1(int ataqueR1) {
        jL_AtaqueR1.setText(ataqueR1+"");
    }

   public void setjL_AtaqueR2(int ataqueR2) {
        jL_AtaqueR2.setText(ataqueR2+"");
    }

   public void agregarImagen1(int i){                       
        Image image=pokemonVect.poke(i).getImagen();
        Icon icon= new ImageIcon(image);
        jL_Pokemon1.setIcon(icon);        
    }
    public void agregarImagen2(int i){
        Image image=pokemonVect.poke(i).getImagen();
        Icon icon= new ImageIcon(image);
        jL_Pokemon2.setIcon(icon);        
    }

    public void setjT_Chat(String mensaje) {
        jT_Chat.setText(mensaje);
    }

    public JTextArea getjT_Chat() {
        return jT_Chat;
    }

    public JTextField getjTChat() {
        return jTChat;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jL_Pokemon1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Chat = new javax.swing.JTextArea();
        jL_Pokemon2 = new javax.swing.JLabel();
        jL_Ataque1 = new javax.swing.JLabel();
        jL_AtaqueR1 = new javax.swing.JLabel();
        jL_AtaqueR2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxJugadores = new javax.swing.JComboBox<>();
        jLabelEntrenadores = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBListo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTChat = new javax.swing.JTextField();
        jLFotoPoke2 = new javax.swing.JLabel();

        jLabel2.setText("CPU");

        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);
        getContentPane().add(jL_Pokemon1);
        jL_Pokemon1.setBounds(110, 110, 40, 40);

        jT_Chat.setColumns(20);
        jT_Chat.setRows(5);
        jScrollPane1.setViewportView(jT_Chat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 180, 542, 96);
        getContentPane().add(jL_Pokemon2);
        jL_Pokemon2.setBounds(450, 90, 83, 66);

        jL_Ataque1.setText("Ataque:");
        getContentPane().add(jL_Ataque1);
        jL_Ataque1.setBounds(76, 161, 39, 14);

        jL_AtaqueR1.setText("0");
        getContentPane().add(jL_AtaqueR1);
        jL_AtaqueR1.setBounds(150, 160, 44, 14);

        jL_AtaqueR2.setText("0");
        getContentPane().add(jL_AtaqueR2);
        jL_AtaqueR2.setBounds(430, 160, 44, 14);

        jLabel1.setText("Ataque:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(482, 161, 39, 14);

        jComboBoxJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxJugadores);
        jComboBoxJugadores.setBounds(50, 50, 180, 20);

        jLabelEntrenadores.setText("Entrenadores");
        getContentPane().add(jLabelEntrenadores);
        jLabelEntrenadores.setBounds(50, 20, 180, 20);

        jLabel3.setText("CPU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 160, 30, 14);

        jBListo.setText("Listo");
        getContentPane().add(jBListo);
        jBListo.setBounds(560, 0, 55, 23);

        jButton1.setText("Ok");
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 280, 45, 23);

        jTChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTChatActionPerformed(evt);
            }
        });
        getContentPane().add(jTChat);
        jTChat.setBounds(50, 280, 490, 20);

        jLFotoPoke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokemon_x_and_y_battle_background_10_by_phoenixoflight92-d843fov.png"))); // NOI18N
        jLFotoPoke2.setText("CPU");
        getContentPane().add(jLFotoPoke2);
        jLFotoPoke2.setBounds(0, 0, 630, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxJugadoresActionPerformed

    private void jTChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTChatActionPerformed

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
    private javax.swing.JButton jBListo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxJugadores;
    private javax.swing.JLabel jLFotoPoke2;
    private javax.swing.JLabel jL_Ataque1;
    private javax.swing.JLabel jL_AtaqueR1;
    private javax.swing.JLabel jL_AtaqueR2;
    private javax.swing.JLabel jL_Pokemon1;
    private javax.swing.JLabel jL_Pokemon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEntrenadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTChat;
    private javax.swing.JTextArea jT_Chat;
    // End of variables declaration//GEN-END:variables
}
