/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ServerPrivado;
import Controlador.ControladorVentanaPrincipal;
import Modelo.RegistroEntrenador;
import java.applet.AudioClip;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorVentanaPrincipal cVentanaPrincipal;
    private ServerPrivado serverP;
    private RegistroEntrenador registro;

    /**
     * Creates new form NewJFrame
     */
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Pokémon");
        this.cVentanaPrincipal = new ControladorVentanaPrincipal(this);
        this.jM_Crear_Entrenador.addActionListener(cVentanaPrincipal);
        this.jM_Ranking.addActionListener(cVentanaPrincipal);
        this.jM_Ver.addActionListener(cVentanaPrincipal);
        this.jB_Batalla.addActionListener(cVentanaPrincipal);
        jB_Batalla.setContentAreaFilled(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(cVentanaPrincipal);
        setSize(497, 359);
        setLocationRelativeTo(null);     
        jR_1Jugador.setSelected(true);
        ButtonGroup grupo= new ButtonGroup();
        grupo.add(jR_1Jugador);
        grupo.add(jR_2Jugadores);
    }

    public void reproducir() {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("pokemon.WAV"));
        sonido.play();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
              
    }      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jR_1Jugador = new javax.swing.JRadioButton();
        jR_2Jugadores = new javax.swing.JRadioButton();
        jB_Batalla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jM_Archivo = new javax.swing.JMenu();
        jM_Entrenador = new javax.swing.JMenu();
        jM_Crear_Entrenador = new javax.swing.JMenuItem();
        jM_Ranking = new javax.swing.JMenuItem();
        jM_Pokedex = new javax.swing.JMenu();
        jM_Ver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jR_1Jugador.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        jR_1Jugador.setForeground(new java.awt.Color(255, 255, 255));
        jR_1Jugador.setText("1 Jugador");
        getContentPane().add(jR_1Jugador);
        jR_1Jugador.setBounds(30, 150, 108, 30);

        jR_2Jugadores.setFont(new java.awt.Font("Pokemon Solid", 0, 18)); // NOI18N
        jR_2Jugadores.setForeground(new java.awt.Color(255, 255, 255));
        jR_2Jugadores.setText("2 Jugadores");
        getContentPane().add(jR_2Jugadores);
        jR_2Jugadores.setBounds(30, 190, 130, 34);

        jB_Batalla.setFont(new java.awt.Font("Pokemon Solid", 0, 24)); // NOI18N
        jB_Batalla.setForeground(new java.awt.Color(255, 255, 255));
        jB_Batalla.setText("Batalla");
        jB_Batalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BatallaActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Batalla);
        jB_Batalla.setBounds(170, 160, 145, 59);

        jButton1.setFont(new java.awt.Font("Pokemon Solid", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Server");
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 270, 90, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 300);

        jM_Archivo.setText("Archivo");
        jMenuBar1.add(jM_Archivo);

        jM_Entrenador.setText("Entrenador");

        jM_Crear_Entrenador.setText("Crear Entrenador");
        jM_Entrenador.add(jM_Crear_Entrenador);

        jM_Ranking.setText("Ranking");
        jM_Entrenador.add(jM_Ranking);

        jMenuBar1.add(jM_Entrenador);

        jM_Pokedex.setText("Pokedex");

        jM_Ver.setText("Ver");
        jM_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_VerActionPerformed(evt);
            }
        });
        jM_Pokedex.add(jM_Ver);

        jMenuBar1.add(jM_Pokedex);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jM_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_VerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jM_VerActionPerformed

    private void jB_BatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BatallaActionPerformed
      
    }//GEN-LAST:event_jB_BatallaActionPerformed

    public boolean selecionJR1(){
        return jR_1Jugador.isSelected();
    }
    public boolean selecionJR2(){
        return jR_2Jugadores.isSelected();
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("pokemon.WAV"));
        sonido.play();
            }
        });

    }

    public JRadioButton getjR_1Jugador() {
        return jR_1Jugador;
    }

    public JRadioButton getjR_2Jugadores() {
        return jR_2Jugadores;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Batalla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jM_Archivo;
    private javax.swing.JMenuItem jM_Crear_Entrenador;
    private javax.swing.JMenu jM_Entrenador;
    private javax.swing.JMenu jM_Pokedex;
    private javax.swing.JMenuItem jM_Ranking;
    private javax.swing.JMenuItem jM_Ver;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jR_1Jugador;
    private javax.swing.JRadioButton jR_2Jugadores;
    // End of variables declaration//GEN-END:variables
}
