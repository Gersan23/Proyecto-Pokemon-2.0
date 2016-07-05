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
import java.util.ArrayList;
import javax.swing.JComboBox;
/**
 *
 * @author Gersan
 */
public class ControladorVentanaRanking implements ActionListener {
    VentanaRanking ventanaR;
    RegistroEntrenador array = new RegistroEntrenador();
    JComboBox combo;
    public ControladorVentanaRanking(VentanaRanking ventanaP,RegistroEntrenador array){
        ventanaR = ventanaP;
        this.array=array;
        ventanaR.llenarComboBox(array);
        numerosRanking(array);
    }
    
    /*public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().){
            
        }
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("activa el ranking entrando");
        //ventanaR.llenarComboBox(array);
      
    }
    
    public void numerosRanking(RegistroEntrenador array){        
        int contador = ventanaR.getjC_Entrenadores().getSelectedIndex();
        System.out.println("este es el contador de ranking" + contador);
        ventanaR.setContadores(contador);
    }
}
