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
import Modelo.Bd_Pokemon;

/**
 *
 * @author GersanElPuto
 */
public class ControladorVentanaCreadorEntrenador implements ActionListener {

    VentanaCreadorEntrenador ventanaCreador;
    RegistroEntrenador registroEntrenador;
    Entrenador entrenador;
    Bd_Pokemon vector = new Bd_Pokemon();

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
        String pokemon1[] = ventanaCreador.getjC_Pokemon1().split("-");
        String pokemon2[]= ventanaCreador.getjC_Pokemon2().split("-");
        String pokemon3[] = ventanaCreador.getjC_Pokemon3().split("-");
entrenador = new Entrenador(ventanaCreador.getjT_Usuario(),ventanaCreador.getjT_Codigo(), 0, 0, pokemon1[1],pokemon2[1],pokemon3[1]);
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
            limpiar();
            ventanaCreador.jT_Usuario.setText(entrenador.getUsuario());
            ventanaCreador.jT_Usuario.setEditable(false);
            ventanaCreador.jT_Codigo.setText(entrenador.getCodigoDeEntrenador());
            ventanaCreador.jT_Codigo.setEditable(false);
            ventanaCreador.jC_Pokemon1.setSelectedIndex(vector.poke1(entrenador.getPokemon1()));
            ventanaCreador.jC_Pokemon2.setSelectedIndex(vector.poke1(entrenador.getPokemon2()));
            ventanaCreador.jC_Pokemon3.setSelectedIndex(vector.poke1(entrenador.getPokemon3()));
           
            
        } else {
            JOptionPane.showMessageDialog(null, "No existe entrenador  registrado con codigo ingresado, por favor verifique");
            limpiar();
        }
    }
    public void modificar()
    {
        if (registroEntrenador.verificarEntrenador(ventanaCreador.getjT_CodigoBuscar())==true){
          //  JOptionPane.showMessageDialog(null,"Ingrese el codigo del entrenador que desea modificar");
        
        }
        entrenador=registroEntrenador.getObjeto(ventanaCreador.getjT_CodigoBuscar());
        if(entrenador==null)
        {
            JOptionPane.showMessageDialog(null,"No se encontro el entrenador con el codigo ingresado");
        }
        ventanaCreador.getjT_CodigoBuscar();
          entrenador.setUsuario(ventanaCreador.getjT_Usuario());
          entrenador.setPokemon1(ventanaCreador.getjC_Pokemon1());
          entrenador.setPokemon2(ventanaCreador.getjC_Pokemon2());
          entrenador.setPokemon3(ventanaCreador.getjC_Pokemon3());
          
          
          
          registroEntrenador.modificar(entrenador);
         // limpiar();
          //JOptionPane.showMessageDialog(null,"Entrenador modificado correctamente");
           JOptionPane.showMessageDialog(null,"Sus nuevos pokemones son: "+"\nPokemon 1: "+entrenador.getPokemon1()+"\nPokemon 2: "+entrenador.getPokemon2()+"\nPokemon 3: "+entrenador.getPokemon3());
    }
}
