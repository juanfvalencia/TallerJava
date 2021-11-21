package com.sofka.ejercicio15;
import java.util.Scanner;

public class Menu {


    boolean preguntar;
    int opcion;
    Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        preguntar = true;
        while(preguntar == true){
            System.out.print("****** GESTION CINEMATOGRAFICA ********" +
                    "\n1- NUEVO ACTOR" +
                    "\n2- BUSCAR ACTOR" +
                    "\n3- ELIMINAR ACTOR" +
                    "\n4- MODIFICAR ACTOR" +
                    "\n5- VER TODOS LOS ACTORES" +
                    "\n6- VER PELICULAS DE LOS ACTORES" +
                    "\n7- VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +
                    "\n8- Salir" +
                    "\n Elige opcion: ");
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    preguntar = false;
                    break;
                default:
                    System.out.println("La opción que selecciono es incorrecta, verifique e intente nuevamente.");
                    break;
            }
        }
    }
}
