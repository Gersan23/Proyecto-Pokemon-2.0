/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entrenador;
import Modelo.RegistroEntrenador;
import Vista.VentanaBatalla;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modelo.VectorPokemon;
import javax.swing.JOptionPane;

/**
 *
 * @author GersanElPuto
 */
public class ControladorVentanaBatalla implements ActionListener {

    VentanaBatalla ventanaBatalla;
    VectorPokemon vector;
    int contadorRounds = 0;
    private ClientePrivado cliente;
    RegistroEntrenador array;
    int rnd = (int) (Math.random() * 100 + 1);
    int rnd2 = (int) (Math.random() * 100 + 1);
    int rnd3 = (int) (Math.random() * 100 + 1);
    int rnd4 = (int) (Math.random() * 100 + 1);
    int rnd5 = (int) (Math.random() * 100 + 1);
    int rnd6 = (int) (Math.random() * 100 + 1);

    public ControladorVentanaBatalla(VentanaBatalla ventanaB, RegistroEntrenador arrayE) {
        ventanaBatalla = ventanaB;
        array = arrayE;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Listo")) {
            lucha(array);
        }
        if (e.getActionCommand().equalsIgnoreCase("Ok")) {
            chat();
        }

    }

    public void lucha(RegistroEntrenador array) {
        Entrenador entrenador;
        int posicion = ventanaBatalla.getjComboBoxJugadores().getSelectedIndex();
        entrenador = array.getObjeto(posicion);
        Entrenador cpu = array.getObjeto(0);
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo para el duelo.\n");        
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo primer round\n");
        setRound1(entrenador);        
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo segundo round\n");
        setRound2(entrenador);
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo tercer round\n");
        setRound3(entrenador);
        int contador = 0;
        if (contadorRounds == 2 || contadorRounds == 3) {
            cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
            cliente.enviarMsg("El ganador fue " + entrenador.getUsuario());
            entrenador.setVictorias(entrenador.getVictorias() + 1);
            cpu.setDerrotas(cpu.getDerrotas() + 1);
        } else {
            cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
            cliente.enviarMsg("El ganador fue CPU1");
            entrenador.setDerrotas(entrenador.getDerrotas() + 1);
            cpu.setVictorias(cpu.getVictorias() + 1);
        }
        contadorRounds = 0;
    }

    public void setRound1(Entrenador entrenador) {
        int ataqueUser = rnd;
        int ataqueCPU = rnd2;
        Entrenador cpu = array.getObjeto(0);
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueCPU);
        //ventanaBatalla.agregarImagen1(buscarPokemon1(entrenador));
        //ventanaBatalla.agregarImagen2(buscarPokemon1(cpu));
        if (rnd > rnd2) {
            contadorRounds++;
        }
    }

    public int buscarPokemon1(Entrenador entrenador) {
        int o = vector.poke1(entrenador.getPokemon1());
        int posicion = o;
        return posicion;
    }

    public void setRound2(Entrenador entrenador) {
        int ataqueUser = rnd3;
        int ataqueCPU = rnd4;
        Entrenador cpu = array.getObjeto(0);
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueCPU);
        //ventanaBatalla.agregarImagen1(buscarPokemon2(entrenador));
        //ventanaBatalla.agregarImagen2(buscarPokemon2(cpu));
        if (rnd > rnd2) {
            contadorRounds++;
        }
    }

    public int buscarPokemon2(Entrenador entrenador) {
        int posicion = vector.poke1(entrenador.getPokemon2());
        return posicion;
    }

    public void setRound3(Entrenador entrenador) {
        int ataqueUser = rnd5;
        int ataqueCPU = rnd6;
        Entrenador cpu = array.getObjeto(0);
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueCPU);
        // ventanaBatalla.agregarImagen1(buscarPokemon2(entrenador));
        // ventanaBatalla.agregarImagen2(buscarPokemon2(cpu));
        if (rnd > rnd2) {
            contadorRounds++;
        }
    }

    public int buscarPokemon3(Entrenador entrenador) {
        int posicion = vector.poke1(entrenador.getPokemon3());
        return posicion;
    }

    public void chat() {
        String nombre = (String) ventanaBatalla.getjComboBoxJugadores().getSelectedItem();
        if (nombre.trim().length() == 0) {
            nombre = "Sin Nombre";
        }
        String msg = ventanaBatalla.getjTChat().getText();
        if (nombre.trim().length() == 0) {
            return;
        }
        ventanaBatalla.getjT_Chat().setText("");
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("-" + nombre + ": " + msg + "\n");
        ventanaBatalla.getjTChat().setText("");
    }
}
