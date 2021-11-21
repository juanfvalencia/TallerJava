package com.sofka.ejercicio17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Electrodomestico {
    private int basePrecio = 100;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(int basePrecio, double peso) {
        this.basePrecio = basePrecio;
        this.peso = peso;
    }

    public Electrodomestico(int basePrecio, String color, char consumoEnergetico, double peso) {
        this.basePrecio = basePrecio;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public int getbasePrecio() {
        return basePrecio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        String letrasValidas = "ABCDEF";
        if(letrasValidas.contains(String.valueOf(letra))){
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color){
        List lista = List.of(new String[]{"blanco", "negro", "rojo", "azul", "gris"});
        if(lista.contains(color.toLowerCase())){
            return color;
        } else {
            return "blanco";
        }
    }

    public double precioFinal() {
        double precioConsumo = 0;
        double precioTamano = 0;
        double precioFinal;
        Map<Character,Integer> consumoEnergeticoMapa = new HashMap<Character,Integer>();
        consumoEnergeticoMapa.put('A',100);
        consumoEnergeticoMapa.put('B',80);
        consumoEnergeticoMapa.put('C',60);
        consumoEnergeticoMapa.put('D',50);
        consumoEnergeticoMapa.put('E',30);
        consumoEnergeticoMapa.put('F',10);
        precioConsumo = consumoEnergeticoMapa.get(consumoEnergetico);

        if(peso>=0 && peso<= 19){
            precioTamano= 10;
        }else if(peso>=20 && peso<= 49){
            precioTamano= 50;
        }else if(peso>=50 && peso<= 79){
            precioTamano= 80;
        }else{
            precioTamano= 100;
        }

        precioFinal = basePrecio+precioConsumo+precioTamano;
        return precioFinal;
    }
}
