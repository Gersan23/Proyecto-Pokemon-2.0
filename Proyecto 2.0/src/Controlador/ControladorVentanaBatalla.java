/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entrenador;
import Modelo.HiloEspera;
import Modelo.RegistroEntrenador;
import Vista.VentanaBatalla;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modelo.Bd_Pokemon;
import Vista.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gersan
 */
public class ControladorVentanaBatalla implements ActionListener {

    HiloEspera hiloEspera;
    VentanaPrincipal ventanaPrin;
    VentanaBatalla ventanaBatalla;
    Bd_Pokemon vector = new Bd_Pokemon();
    int contadorRounds = 0;
    private ClientePrivado cliente;
    RegistroEntrenador bdEntrenador = new RegistroEntrenador();
    int rnd = (int) (Math.random() * 100 + 1);
    int rnd2 = (int) (Math.random() * 100 + 1);
    int rnd3 = (int) (Math.random() * 100 + 1);
    int rnd4 = (int) (Math.random() * 100 + 1);
    int rnd5 = (int) (Math.random() * 100 + 1);
    int rnd6 = (int) (Math.random() * 100 + 1);

    public ControladorVentanaBatalla(VentanaBatalla ventanaB, RegistroEntrenador arrayE) {
        ventanaBatalla = ventanaB;
        bdEntrenador = arrayE;

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Listo")) {
            ventanaPrin = new VentanaPrincipal();
            hiloEspera = new HiloEspera(this, ventanaPrin);
            if (ventanaPrin.selecionJR1()) {
                hiloEspera.start();
            }
           if(ventanaPrin.selecionJR2()){
                hiloEspera.start();
            }
        }
        if (e.getActionCommand().equalsIgnoreCase("Ok")) {
            chat();
        }

    }

    public void dormir(long segundos) {
        try {
            HiloEspera.sleep(segundos);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorVentanaBatalla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void lucha() {
        rnd = (int) (Math.random() * 100 + 1);
        rnd2 = (int) (Math.random() * 100 + 1);
        rnd3 = (int) (Math.random() * 100 + 1);
        rnd4 = (int) (Math.random() * 100 + 1);
        rnd5 = (int) (Math.random() * 100 + 1);
        rnd6 = (int) (Math.random() * 100 + 1);
        Entrenador entrenador;
        String posicionNombre = ventanaBatalla.getjComboBoxJugadores();

        entrenador = bdEntrenador.getObjetoU(posicionNombre);//devuelve un entrenador por nombre
        Entrenador cpu = bdEntrenador.getObjeto(0);
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo para el duelo.\n");
        dormir(1000);
        setRound1(entrenador);//round 1
        dormir(1000);
        dormir(1000);
        setRound2(entrenador);//round 2
        dormir(1000);
        dormir(1000);
        setRound3(entrenador);//round 3
        dormir(1000);

        int contador = 0;
        if (contadorRounds == 2 || contadorRounds == 3) {
            cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
            cliente.enviarMsg("El ganador fue " + entrenador.getUsuario() + ".\n");
            entrenador.setVictorias(entrenador.getVictorias() + 1);
            cpu.setDerrotas(cpu.getDerrotas() + 1);
        } else {
            cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
            cliente.enviarMsg("El ganador fue CPU1.\n");
            entrenador.setDerrotas(entrenador.getDerrotas() + 1);
            cpu.setVictorias(cpu.getVictorias() + 1);
        }
        contadorRounds = 0;
        ventanaBatalla.getjL_AtaqueR1().setText(0 + "");
        ventanaBatalla.getjL_AtaqueR2().setText(0 + "");
    }

    public void setRound1(Entrenador entrenador) {
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo primer round\n");

        int ataqueUser = rnd;
        int ataqueCPU = rnd2;
        Entrenador cpu = bdEntrenador.getObjeto(0);
        //Entrenador
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueCPU);
        ventanaBatalla.agregarImagen1(buscarPokemon1(entrenador));//
        ventanaBatalla.agregarImagen2(buscarPokemon1(cpu));
        if (rnd > rnd2) {
            contadorRounds++;
        }
    }

    public void setRound2(Entrenador entrenador) {
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo segundo round\n");
        int ataqueUser = rnd3;
        int ataqueCPU = rnd4;
        Entrenador cpu = bdEntrenador.getObjeto(0);
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueCPU);
        ventanaBatalla.agregarImagen1(buscarPokemon2(entrenador));
        ventanaBatalla.agregarImagen2(buscarPokemon2(cpu));
        if (rnd > rnd2) {
            contadorRounds++;
        }
    }

    public void setRound3(Entrenador entrenador) {
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo tercer round\n");
        int ataqueUser = rnd5;
        int ataqueCPU = rnd6;
        Entrenador cpu = bdEntrenador.getObjeto(0);
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueCPU);
        ventanaBatalla.agregarImagen1(buscarPokemon3(entrenador));
        ventanaBatalla.agregarImagen2(buscarPokemon3(cpu));
        if (rnd > rnd2) {
            contadorRounds++;
        }
    }

///////////MULTIJUGADOR//////////////////////////////////////////////
    public void luchaMulti() {
        rnd = (int) (Math.random() * 100 + 1);
        rnd2 = (int) (Math.random() * 100 + 1);
        rnd3 = (int) (Math.random() * 100 + 1);
        rnd4 = (int) (Math.random() * 100 + 1);
        rnd5 = (int) (Math.random() * 100 + 1);
        rnd6 = (int) (Math.random() * 100 + 1);
        Entrenador entrenador;
        String posicionNombre = ventanaBatalla.getjComboBoxJugadores();
        entrenador = bdEntrenador.getObjetoU(posicionNombre);
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        ventanaBatalla.getjLJugador2().setText(cliente.enviarNombre());
        cliente.enviarMsg("Listo para el duelo Multijugador.\n");
        ventanaBatalla.getjLJugador2().setText(cliente.enviarNombre());
        dormir(1000);
        setRoundMulti1(entrenador);//round 1
        dormir(1000);
        dormir(1000);
        setRoundMulti2(entrenador);//round 2
        dormir(1000);
        dormir(1000);
        setRoundMulti3(entrenador);//round 3
        dormir(1000);

        int contador = 0;
        if (contadorRounds == 2 || contadorRounds == 3) {
            cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
            cliente.enviarMsg("El ganador fue " + entrenador.getUsuario() + ".\n");
            entrenador.setVictorias(entrenador.getVictorias() + 1);
        } else {
            cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
            cliente.enviarMsg("El ganador fue " + cliente.enviarNombre());
            entrenador.setDerrotas(entrenador.getDerrotas() + 1);
        }
        contadorRounds = 0;
        ventanaBatalla.getjL_AtaqueR1().setText(0 + "");
        ventanaBatalla.getjL_AtaqueR2().setText(0 + "");
    }

    public void setRoundMulti1(Entrenador entrenador) {
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo segundo round\n");
        cliente.enviarDatos(ventanaBatalla.getjComboBoxJugadores(), buscarPokemon1(entrenador), rnd);
        int ataqueUser = rnd;
        int ataqueJ2 = cliente.enviarAtaque();
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueJ2);
        ventanaBatalla.agregarImagen1(buscarPokemon1(entrenador));//
        ventanaBatalla.agregarImagen2(cliente.enviarPokemon());
        if (rnd > ataqueJ2) {
            contadorRounds++;
        }
    }

    public void setRoundMulti2(Entrenador entrenador) {
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo primer round\n");
        cliente.enviarDatos(ventanaBatalla.getjComboBoxJugadores(), buscarPokemon2(entrenador), rnd3);

        int ataqueUser = rnd3;
        int ataqueJ2 = cliente.enviarAtaque();
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueJ2);
        ventanaBatalla.agregarImagen1(buscarPokemon2(entrenador));//
        ventanaBatalla.agregarImagen2(cliente.enviarPokemon());
        if (rnd > ataqueJ2) {
            contadorRounds++;
        }

    }

    public void setRoundMulti3(Entrenador entrenador) {
        cliente = new ClientePrivado(ventanaBatalla.getjT_Chat());
        cliente.enviarMsg("Listo tercer round\n");

        cliente.enviarDatos(ventanaBatalla.getjComboBoxJugadores(), buscarPokemon3(entrenador), rnd5);
        int ataqueUser = rnd5;
        int ataqueJ2 = cliente.enviarAtaque();
        ventanaBatalla.setjL_AtaqueR1(ataqueUser);
        ventanaBatalla.setjL_AtaqueR2(ataqueJ2);
        ventanaBatalla.agregarImagen1(buscarPokemon3(entrenador));//
        ventanaBatalla.agregarImagen2(cliente.enviarPokemon());
        if (rnd > ataqueJ2) {
            contadorRounds++;
        }
    }

//////////// UTILES /////////////////////////////
    public void chat() {
        String nombre = ventanaBatalla.getjComboBoxJugadores();
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

    public int buscarPokemon1(Entrenador entrenador) {
        System.out.println("pokemon 1 " + entrenador.getPokemon1());
        int o = vector.poke1(entrenador.getPokemon1());
        //int posicion = o;
        return o;
    }

    public int buscarPokemon2(Entrenador entrenador) {
        int posicion = vector.poke1(entrenador.getPokemon2());
        return posicion;
    }

    public int buscarPokemon3(Entrenador entrenador) {

        int posicion = vector.poke1(entrenador.getPokemon3());//que hace esto
        return posicion;//regresalaposicion del pokemon
    }
}
