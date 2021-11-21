package com.sofka.ejercicio14;
import java.util.Scanner;

public class ImprimirNumeros {

    int cont;
    Scanner input = new Scanner(System.in);

    public void solicitarDato(){
        System.out.println("Por favor ingrese un numero: ");
        cont = input.nextInt();
    }
    public void imprimir(){
        for(int i = cont;i <= 1000;i+=2){
            System.out.print(i+",");
        }
    }
}
