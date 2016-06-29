/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;
import javax.swing.Icon;

/**
 *
 * @author Erick
 */
public class Pokemon {

private String nombre;
private int ataque;
private String numero;
private Image imagen;//LA IDEA ES METER ESTE ATRIBUTO AL VECTOR
private String detalle;

public Pokemon(String nombre, int ataque, String numero,Image icon, String detalle)
{
    this.nombre=nombre;
    this.ataque=ataque;
    this.numero=numero;
    this.imagen=icon;
    this.detalle=detalle;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Image getImagen(){
        return imagen;
    }
    
    public void setImagen(Image imagen){
        this.imagen = imagen;
    }
    
     public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
