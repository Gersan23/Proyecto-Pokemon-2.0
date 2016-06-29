/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entrenador;
import Modelo.RegistroEntrenador;
import Vista.VentanaCreadorEntrenador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author GersanElPuto
 */
public class ControladorVentanaCreadorEntrenador implements ActionListener {

    VentanaCreadorEntrenador ventanaCreador;
    RegistroEntrenador regristroEntrenador;
    Entrenador entrenador;

    public ControladorVentanaCreadorEntrenador(VentanaCreadorEntrenador ventanita, RegistroEntrenador registroEnt) {
        ventanaCreador = ventanita;
        regristroEntrenador = registroEnt;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Crear")) {
            crearEntrenador();
            System.out.println("Boton Crear");
        }
        if (e.getActionCommand().equalsIgnoreCase("Limpiar")) {
            limpiar();
        }
        if (e.getActionCommand().equalsIgnoreCase("Borrar")) {
            eliminar();
        }
        if (e.getActionCommand().equalsIgnoreCase("Modificar")) {

        }
        if (e.getActionCommand().equalsIgnoreCase("Buscar")) {

        }

    }

    public void limpiar() {
        ventanaCreador.limpiar("", "");
    }

        
    public void crearEntrenador() {//aqui empezó crearEntrenador
        Entrenador aux;
        String pokemon1 = ventanaCreador.getjC_Pokemon1();
        String pokemon2 = ventanaCreador.getjC_Pokemon2();
        String pokemon3 = ventanaCreador.getjC_Pokemon3();
        entrenador = new Entrenador(ventanaCreador.getjT_Usuario(), ventanaCreador.getjT_Codigo(), 0, 0, ventanaCreador.getjC_Pokemon1(), ventanaCreador.getjC_Pokemon3(), ventanaCreador.getjC_Pokemon3());
        System.out.println(regristroEntrenador.getTamano());
        if (regristroEntrenador.getTamano() != 0) {
            System.out.println("lista con datos");
            if (regristroEntrenador.verificarDatos(entrenador)) {

                regristroEntrenador.setObjeto(entrenador);
                JOptionPane.showMessageDialog(null, "Creado con satisfacción.");
                limpiar();
            }

        } else {
            System.out.println("lista sin datos");
            regristroEntrenador.setObjeto(entrenador);
            JOptionPane.showMessageDialog(null, "Creado con satisfacción.");
            limpiar();
        }

    }//aqui termino crearEntrenador

    public void eliminar() {
        regristroEntrenador.eliminar(ventanaCreador.getjT_CodigoBuscar());
        JOptionPane.showMessageDialog(null, "Borrado con satiscacción");
    }
}
