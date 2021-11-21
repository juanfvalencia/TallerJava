package com.sofka.ejercicio7;

import java.util.Scanner;

public class Numero {
    int num;
    //int cont=0;
    Scanner input = new Scanner(System.in);

    public void solicitarParametro(){
        System.out.println("Ingrese el numero: ");
        num = input.nextInt();
    }
    public void validarNumero(){
        do{
            if(num>=0){
                System.out.println("El numero "+num+" es mayor o igual a cero");
            }else {
                System.out.println("El numero ingresado es menor que cero, ingrese otro numero: ");
                num = input.nextInt();
            }
        }while(num<0);
    }
}
