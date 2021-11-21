package com.sofka.ejercicio12;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class main {

    public static void diferencias(String palabra1, String palabra2) {
        StringBuilder similar = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(char cont : palabra2.toCharArray()) {
            set.add(cont);
        }
        for(char c : palabra1.toCharArray())
        {
            if(!set.contains(c))
                similar.append(c);
        }
        System.out.println("Las diferencias son: "+similar);
    }

    public static void main(String[] args) {
        String palabra1 = JOptionPane.showInputDialog("Ingrese una palabra").toLowerCase();
        String palabra2 = JOptionPane.showInputDialog("Ingrese otra palabra").toLowerCase();
        char[] p1 = palabra1.toCharArray();
        char[] p2 = palabra2.toCharArray();

        if(palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            if(p1.length >= p2.length) {
                diferencias(palabra1, palabra2);
            } else if (p1.length < p2.length) {
                diferencias(palabra2, palabra1);
            }
        }
    }
}
