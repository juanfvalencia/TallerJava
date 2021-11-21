package com.sofka.ejercicio1;

public class Validar {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        if(num1==num2){
            System.out.println("El numero " + num1 + " y el numero " + num2 + "son iguales");
        }
        else if(num1>num2){
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        }else{
            System.out.println("El numero "+ num2 + " es mayor que el numero "+ num1);
        }
    }
}
