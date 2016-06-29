/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaPokedex;
import Modelo.Pokemon;
import Modelo.VectorPokemon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
/**
 *
 * @author GersanElPuto
 */
public class ControladorPokedex implements ActionListener{
    VentanaPokedex ventanaCreador;
    Pokemon pokemon;
    VectorPokemon vectorPokemon;
    public ControladorPokedex(VentanaPokedex ventana){
        
        ventanaCreador = ventana;
    }
    
      public void actionPerformed(ActionEvent e)
      {
         poneImg();
      }
    
    public void poneImg(){  
        
        ventanaCreador.agregarImagen(ventanaCreador.getjC_Lista().getSelectedIndex());
        ventanaCreador.agregarTexto(ventanaCreador.getjC_Lista().getSelectedIndex());
    }
              
}     
    
    
