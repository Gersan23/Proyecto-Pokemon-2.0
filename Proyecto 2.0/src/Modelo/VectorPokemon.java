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


/**
 *
 * @author llasu
 */
public class VectorPokemon {
      private Pokemon vectorPoke[];
    DevuelveImagen imagen= new DevuelveImagen();
    private String [] infoPokemon;  
    private ArrayList<Pokemon> arrayPoke=new ArrayList<>();
    private Pokemon poke;
    private int entero;
    public VectorPokemon(){
       inicializarPokemon();
       infoPokemon= new String [151];
        
    }
    public Pokemon poke(int posicion){
        return arrayPoke.get(posicion);
    }
    
    public void inicializarPokemon(){//buscar metodo 
       Iterador iteradorPokemon =new Iterador ("POKEHOLIC.txt");
       
        while(iteradorPokemon.hasNext()){
            infoPokemon=((String)iteradorPokemon.next()).split(";");
            //ARREGLO PARA METER POSICIONES EN EL XML
            //System.out.println("spli"+ infoPokemon[0]+infoPokemon[1]);
            if(!infoPokemon[0].equals("")){
                poke=new Pokemon(infoPokemon[0], 2, infoPokemon[1], imagen.inicializarPokemon(Integer.parseInt(infoPokemon[1])), infoPokemon[2]);
                arrayPoke.add(poke); 
            }
            
        }
    }
    
    public int getTamano(){
        return arrayPoke.size();
    }
    
}//Fin de la class
