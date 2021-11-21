package com.sofka.ejercicio17;

public class Lavadora extends Electrodomestico {

    int carga = 5;

    public Lavadora() {
    }

    public Lavadora(int basePrecio, double peso) {
        super(basePrecio, peso);
    }

    public Lavadora(int basePrecio, String color, char consumoEnergetico, double peso, int carga) {
        super(basePrecio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioModificado = 0;
        double precioCarga = 0;
        if (carga > 30) precioCarga = 50;
        precioModificado = super.precioFinal() + precioCarga;
        return precioModificado;
    }
}