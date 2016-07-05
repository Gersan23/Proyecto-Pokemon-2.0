/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author Erick
 */
public class ClientePrivado implements Runnable {

    private Socket cliente;
    private DataInputStream in;
    private DataOutputStream out;
    String jugador = "";
    int numeroPoke;
    int ataquePoke;
    private int puerto = 2027;
    private String host = "localhost";
    private String mensajes = "";
    JTextArea text;

    public ClientePrivado(JTextArea panel) {
        this.text = panel;
        try {
            cliente = new Socket(host, puerto);
            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        try {

            while (true) {
                mensajes += in.readUTF();
                text.setText(mensajes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviarMsg(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     public void enviarDatos(String nombre, int pokemon, int ataque) {

        String recibido = "nombre;pokemon;ataque";
        String[] valores = recibido.split(";");
        String nombreJ = valores[0];
        int pokemonNum = Integer.parseInt(valores[1]);
        int ataque1 = Integer.parseInt(valores[2]);
        try{
            out.writeUTF(recibido);
        } catch (IOException e){
            e.printStackTrace();
            
        }
        recibirNombre(nombre);
        recibirPokemon(pokemonNum);
        recibirAtaque(ataque1);
    }

    public void recibirNombre(String nombre) {
        String jugador = nombre;
    }
    public String enviarNombre(){
        return this.jugador;
    }
    public void recibirPokemon(int pokemon){
        int numeroPoke = pokemon;
    }
    public int enviarPokemon(){
        return this.numeroPoke;
    }
    public void recibirAtaque(int ataque){
        int ataquePoke = ataque;
    }
    public int enviarAtaque(){
        return this.ataquePoke;
    }
    
}