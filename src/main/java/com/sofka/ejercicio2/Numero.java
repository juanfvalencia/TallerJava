package com.sofka.ejercicio2;

import java.util.Scanner;
public class Numero {

    int num1, num2;
    Scanner input = new Scanner(System.in);
    public void solicitarNumeros(){
        System.out.println("Ingrese 2 numeros por favor: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
    }
    public void validarNumero(){
        if(num1 == num2){
            System.out.println("Los numero ingresados son iguales.");
        }else if(num1 > num2){
            System.out.println("El numero 1 es mayor que el numero 2.");
        }else{
            System.out.println("El numero 2 es mayor que el numero 1.");
        }
    }
}
