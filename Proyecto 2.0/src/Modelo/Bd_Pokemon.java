/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;
import javax.swing.ImageIcon;
import imagenes.DevuelveImagen;
import Modelo.Pokemon;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author llasu
 */
public class Bd_Pokemon {

    DevuelveImagen imagen = new DevuelveImagen();
    //private String [] infoPokemon;  
    private ArrayList<Pokemon> arrayPoke = new ArrayList<>();
    private Pokemon poke;
    private int entero;
    int contador = 0;
    String aux4 = "";
    Iterador iteradorPokemon = new Iterador("POKEHOLIC.txt");

    public Bd_Pokemon() {
        inicializarPokemon();

    }

    public Pokemon poke(int posicion) {
        //System.out.println("poss"+posicion);
        return arrayPoke.get(posicion);
    }

    public int poke1(String nombre) {
        
//        String split[] = nombre.split("-");
        int posicion = 0;
        if (arrayPoke != null) {
            System.out.println("dentro del metodo poke "+ nombre);
            for (int i = 0; i < arrayPoke.size(); i++) {
                if (arrayPoke.get(i).getNombre().equalsIgnoreCase(nombre)) {
                  posicion = i;
                  i=arrayPoke.size();
                }
                else{
                    posicion=-1;
                }
            }
        }

        return posicion;
    }

    public void inicializarPokemon() {//buscar metodo 
        String lineaTxT;
        while (iteradorPokemon.hasNext()) {
            contador++;
            lineaTxT = (String) iteradorPokemon.next();
            if (lineaTxT != null) {
                String[] infoPokemon = lineaTxT.split("/");
                String detallePoke = infoPokemon[2];
                String aux3[] = detallePoke.split("-");
                for (int i = 0; i < aux3.length; i++) {
                    aux4 += aux3[i] + "\n";
                }
                poke = new Pokemon(infoPokemon[0], ramndom(), infoPokemon[1], imagen.inicializarPokemon(Integer.parseInt(infoPokemon[1])), aux4);
                aux4 = "";
                arrayPoke.add(poke);
            }
        }
    }

    //METER UN NUEVO ATRIBUTO VIDA QUE TENGA 100
    public int ramndom() {//valores entre 15 - 100
        Random r = new Random();
        int valorDado = r.nextInt(100);
        return valorDado;
    }

    public int getTamano() {
        return arrayPoke.size();
    }

}//Fin de la class
