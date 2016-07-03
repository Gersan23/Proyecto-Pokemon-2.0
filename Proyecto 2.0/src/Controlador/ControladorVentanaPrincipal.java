/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RegistroEntrenador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VentanaCreadorEntrenador;
import Vista.VentanaRanking;
import Vista.VentanaPokedex;
import Vista.VentanaBatalla;
import Modelo.ServerPrivado;
import Vista.VentanaPrincipal;

/**
 *
 * @author Gersan
 */
public class ControladorVentanaPrincipal implements ActionListener {

    private VentanaCreadorEntrenador ventanaC;
    private VentanaRanking ventanaR;
    private VentanaPokedex ventanaP;
    private VentanaBatalla ventanaB;
    private RegistroEntrenador registro;
    private ServerPrivado server;
    private VentanaPrincipal ventanaPrin;
    private ControladorVentanaRanking controlR;
    public ControladorVentanaPrincipal() {
        registro = new RegistroEntrenador();
        ventanaC = new VentanaCreadorEntrenador(registro);

        ventanaP = new VentanaPokedex();
        
        server = new ServerPrivado();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Crear Entrenador")) {
           
            ventanaC.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Ranking")) {
            ventanaR = new VentanaRanking(registro);
            ventanaR.show();
            ventanaR.llenarComboBox(registro);
        }
        if (e.getActionCommand().equalsIgnoreCase("Ver")) {
            ventanaP.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Batalla")) {
            ventanaB = new VentanaBatalla(registro);           
            ventanaB.show();
             ventanaB.llenarComboBox(registro);
        }
        if (e.getActionCommand().equalsIgnoreCase("Server")) {
            server = new ServerPrivado();
            Thread servidorP = new Thread(server);
            servidorP.start();
        }
        
        
    }
}
