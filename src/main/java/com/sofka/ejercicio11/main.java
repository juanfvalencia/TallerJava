package com.sofka.ejercicio11;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingrese una frase cualquiera");
        //int nVocales = 0;
        int a=0,e=0,i=0,o=0,u=0;
        int longitud = frase.length();

        for (int cont = 0; cont < frase.length(); cont++) {
            switch (frase.charAt(cont)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("La longitud de la frase es: " + longitud);
        System.out.println("La frase: "+frase+", contiene a="+a+", e="+e+", i="+i+", o="+o+", u="+u+".");
    }
}
