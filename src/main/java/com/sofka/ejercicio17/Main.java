package com.sofka.ejercicio17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;

        Electrodomestico[] ArrayElectrodomesticos = new Electrodomestico[10];
        ArrayElectrodomesticos[0] = new Electrodomestico();
        ArrayElectrodomesticos[1] = new Electrodomestico(150, 25);
        ArrayElectrodomesticos[2] = new Electrodomestico(200,"azul",'B',35);
        ArrayElectrodomesticos[3] = new Lavadora(200,75);
        ArrayElectrodomesticos[4] = new Lavadora(200,70);
        ArrayElectrodomesticos[5] = new Lavadora(200,"verde",'C',34.1,50);
        ArrayElectrodomesticos[6] = new Television(150,45);
        ArrayElectrodomesticos[7] = new Television(120,50);
        ArrayElectrodomesticos[8] = new Television(170,"grismetal",'D',25.1,41,true);
        ArrayElectrodomesticos[9] = new Television(170,"azulmetal",'A',25.1,41,false);

        for (Electrodomestico item : ArrayElectrodomesticos) {
            sumaElectrodomesticos += item.precioFinal();

            if (item instanceof Lavadora) {
                sumaLavadoras += item.precioFinal();
            }
            if (item instanceof Television) {
                sumaTelevisores += item.precioFinal();
            }
        }
        System.out.println("Total Electrodomesticos: $"+sumaElectrodomesticos);
        System.out.println("Total Lavadoras: $"+sumaLavadoras);
        System.out.println("Total Televisores: $"+sumaTelevisores);
    }
}
