/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Entrenador;
import Vista.VentanaRanking;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modelo.RegistroEntrenador;
import Vista.VentanaPokedex;
import javax.swing.JComboBox;
/**
 *
 * @author Gersan
 */
public class ControladorVentanaRanking implements ActionListener {
    VentanaRanking ventanaR;
    RegistroEntrenador array;
    JComboBox combo;
    public ControladorVentanaRanking(VentanaRanking ventanaP){
        ventanaR = ventanaP;
    }
    
    /*public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().){
            
        }
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        numerosRanking();
    }
    
    public void numerosRanking(){
        int contador = ventanaR.getjC_Entrenadores().getSelectedIndex();
        ventanaR.setContadores(contador);
    }
}
