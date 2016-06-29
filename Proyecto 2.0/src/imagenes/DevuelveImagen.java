/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class DevuelveImagen {
    String laImagen;
     public Image inicializarPokemon(int numeroImagen){//buscar metodo
         laImagen=numeroImagen+".png";
         Image imagenPackage = new ImageIcon(
         getClass().getResource(laImagen)
        ).getImage();
        return imagenPackage;
     }
    
}
