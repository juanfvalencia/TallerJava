package com.sofka.ejercicio8;
import java.util.Scanner;

public class ValidarDia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un dia de la semana:");
        String dia = input.nextLine();
        switch (dia.toLowerCase()){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El día seleccionado es dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El día seleccionado no es dia laboral");
                break;
            default:
                System.out.println("No ingresaste un dia valido");
        }
    }
}

