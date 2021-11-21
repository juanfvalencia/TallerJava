package com.sofka.ejercicio10;
import java.util.Scanner;

public class eliminarEspacios {

        String frase;
        Scanner scanner = new Scanner(System.in);

        public void recibirFrase(){
            System.out.println("Introduzca la frase cuyos espacios desea eliminar: ");
            frase = scanner.nextLine();
            frase = frase.replace(" ", "");
            System.out.println("Al retirar los espacios de esta frase obtenemos: " + frase);
        }
    }

