/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorVentanaBatalla;
import Vista.VentanaBatalla;
import Vista.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gersan
 */
public class HiloEspera extends Thread {
    VentanaPrincipal ventanaP;
    ControladorVentanaBatalla controlB;
    public HiloEspera(ControladorVentanaBatalla control){
    controlB = control;
    }
    public void run(){
        while(true){
            try {
                sleep(1000);
                if(ventanaP.getjR_1Jugador().isSelected()){
                controlB.lucha();
                }
                suspend();
                System.out.println("Durmiendo");
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloEspera.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
