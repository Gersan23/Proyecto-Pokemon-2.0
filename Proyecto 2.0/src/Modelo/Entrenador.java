/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Erick
 */
public class Entrenador {
    
    private String usuario, codigoDeEntrenador, pokemon1, pokemon2, pokemon3;
    private int victorias, derrotas;
    
    public Entrenador(String usuario, String codigoDeEntrenador, int victorias, int derrotas, String pokemon1, String pokemon2, String pokemon3)
    {
        this.usuario=usuario;
        this.codigoDeEntrenador=codigoDeEntrenador;
        this.victorias=victorias;
        this.derrotas=derrotas;
        this.pokemon1=pokemon1;
        this.pokemon2=pokemon2;
        this.pokemon3=pokemon3;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodigoDeEntrenador() {
        return codigoDeEntrenador;
    }

    public void setCodigoDeEntrenador(String codigoDeEntrenador) {
        this.codigoDeEntrenador = codigoDeEntrenador;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(String pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public String getPokemon2() {
        return pokemon2;
    }

    public void setPokemon2(String pokemon2) {
        this.pokemon2 = pokemon2;
    }

    public String getPokemon3() {
        return pokemon3;
    }

    public void setPokemon3(String pokemon3) {
        this.pokemon3 = pokemon3;
    }
    
    public String getInformacion()
    {  
    String msj="";
    return msj;
    }
   }

