package com.sofka.ejercicio17;

public class Television extends Electrodomestico {
    int resolucion = 20;
    boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(int basePrecio, double peso) {
        super(basePrecio, peso);
    }

    public Television(int basePrecio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(basePrecio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioModificado = 0;
        double precioResolucion = 0;
        double precioSintonizador = 0;

        if (resolucion > 40) precioResolucion = super.precioFinal() * 0.3;
        if (sintonizadorTDT == true) precioSintonizador = 50;
        precioModificado = super.precioFinal() + precioResolucion + precioSintonizador;
        return precioModificado;
    }
}
