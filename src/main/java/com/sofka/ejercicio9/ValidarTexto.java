package com.sofka.ejercicio9;
import java.util.Scanner;

public class ValidarTexto {

    String texto;
    String textoAdicional;

    Scanner scanner = new Scanner(System.in);

    public void reemplazo(){

        texto = "La sonrisa sera la mejor arma contra la tristeza ";
        texto = texto.replace("a", "e");
        System.out.println("La frase despues del reemplazo es: " + texto);
    }

    public void unirFrase(){
        System.out.println("Introduzca el texto que desea añadir: ");
        textoAdicional = scanner.nextLine();
        texto = texto.concat(textoAdicional);
        System.out.println("La frase despues del reemplazo y añadir el texto del usuario es: "+ texto);
    }

    //}
}
