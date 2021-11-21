package com.sofka.ejercicio16;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 3; i++) {
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                char sexo = JOptionPane.showInputDialog("Ingrese su sexo ('M' para hombre y 'F' para mujer:)").toUpperCase().charAt(0);
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kg:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en metros: "));

                if(i == 1){
                    Persona p1 = new Persona(nombre, sexo, edad, peso, altura);
                    System.out.println("----------PERSONA 1----------");
                    System.out.println(p1.mostrarEdad(p1.esMayorDeEdad()));
                    System.out.println(p1.mostrarIMC(p1.calcularIMC()));
                    System.out.println(p1.toString());
                } else if (i == 2) {
                    Persona p2 = new Persona(nombre, sexo, edad);
                    p2.setAltura(altura);
                    p2.setPeso(peso);
                    System.out.println("----------PERSONA 2----------");
                    System.out.println(p2.mostrarEdad(p2.esMayorDeEdad()));
                    System.out.println(p2.mostrarIMC(p2.calcularIMC()));
                    System.out.println(p2.toString());
                } else {
                    Persona p3 = new Persona();
                    p3.setNombre(nombre);
                    p3.setEdad(edad);
                    p3.setSexo(sexo);
                    p3.setPeso(peso);
                    p3.setAltura(altura);
                    System.out.println("----------PERSONA 3----------");
                    System.out.println(p3.mostrarEdad(p3.esMayorDeEdad()));
                    System.out.println(p3.mostrarIMC(p3.calcularIMC()));
                    System.out.println(p3.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("El dato ingresado es incorrecto");
        }
    }
}