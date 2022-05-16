/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu.cifrado;

import java.util.ArrayList;

/**
 *
 * @author arman
 */
public class CodigoCesar {
    private int codigo;
    private String alfabeto = "abcdefghijklmnñopqrstuvwxyzt";

    public String Cadenas = "";

    public CodigoCesar() {
    }

    public void secret(String cadena) {
        String cadena2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < alfabeto.length(); j++) {
                if (cadena.charAt(i) == alfabeto.charAt(j)) {
                    cadena2 += alfabeto.charAt((j + codigo) %alfabeto.length());
                }
            }
        }
    cadena = cadena2;
    System.out.println("palabras");

    Cadenas = cadena;
    }
    
    public void unsecret(String cadena) {
        String cadena2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < alfabeto.length(); j++) {
                if (cadena.charAt(i) == alfabeto.charAt(j)) {
                    cadena2 += alfabeto.charAt((j - codigo) % alfabeto.length());
                }
            }
        }
    cadena = cadena2;
    System.out.println("palabras");

    Cadenas = cadena;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
