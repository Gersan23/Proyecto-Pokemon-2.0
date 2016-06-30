/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Iterador implements Iterator {
 
    BufferedReader br;
    boolean finaliced;
    String path;

    public Iterador(String path) {
        this.path=path;
        finaliced = true;
        try {
            read_file(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Iterador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void read_file(String path) throws FileNotFoundException {
        FileInputStream fstream = new FileInputStream(path);
        br = new BufferedReader(new InputStreamReader(fstream));
    }

    @Override
    public boolean hasNext() {
        return !finaliced;
    }

    private String get_new_line() {
        String strLine = null;
        try {
            if(!finaliced)
            strLine = br.readLine();
        } catch (IOException ex) {
            strLine=null;
        }
        return strLine;
    }

    @Override
    public Object next() {
        
        String strLine=null;
        if(!finaliced){
            strLine = get_new_line();
            if (strLine == null) {
                finaliced = true;
                closeBuffer();
                strLine=null;
            }
        }
        return strLine;
    }

    
    private void closeBuffer(){
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Iterador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
