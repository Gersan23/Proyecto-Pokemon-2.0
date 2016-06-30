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
    RegistroEntrenador registroEntrenador;
    Entrenador entrenador;

    public ControladorVentanaCreadorEntrenador(VentanaCreadorEntrenador ventanita, RegistroEntrenador registroEnt) {
        ventanaCreador = ventanita;
        registroEntrenador = registroEnt;
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
            modificar();
        }
        if (e.getActionCommand().equalsIgnoreCase("Buscar")) {
            buscar();
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
        System.out.println(registroEntrenador.getTamano());
        if (registroEntrenador.getTamano() != 0) {
            System.out.println("lista con datos");
            if (registroEntrenador.verificarDatos(entrenador)) {

                registroEntrenador.setObjeto(entrenador);
                JOptionPane.showMessageDialog(null, "Creado con satisfacción.");
                limpiar();
            }

        } else {
            System.out.println("lista sin datos");
            registroEntrenador.setObjeto(entrenador);
            JOptionPane.showMessageDialog(null, "Creado con satisfacción.");
            limpiar();
        }

    }//aqui termino crearEntrenador

    public void eliminar() {
        registroEntrenador.eliminar(ventanaCreador.getjT_CodigoBuscar());
        JOptionPane.showMessageDialog(null, "Borrado con satiscacción");
    }

    public void buscar() {
        if (registroEntrenador.verificarEntrenador(ventanaCreador.getjT_CodigoBuscar())) {
            JOptionPane.showMessageDialog(null, "Informacion\n" +registroEntrenador.imprimir(ventanaCreador.getjT_CodigoBuscar() + ""));
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No existe entrenador  registrado con codigo ingresado, por favor verifique");
            limpiar();
        }
    }
    public void modificar()
    {
        Entrenador entrenador = registroEntrenador.getObjeto(ventanaCreador.getjT_Codigo());
        entrenador.setPokemon1(ventanaCreador.getjC_Pokemon1());
        entrenador.setPokemon2(ventanaCreador.getjC_Pokemon2());
        entrenador.setPokemon3(ventanaCreador.getjC_Pokemon3());
    }
}
