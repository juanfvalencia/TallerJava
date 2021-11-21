package com.sofka.ejercicio4;

import javax.swing.*;

public class Iva {

    double precio;
    final double iva = 0.21;

    public void solicitarValor(){
        precio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio del producto: "));
    }
    public void calcuarIva(){
        double costoIva = precio*iva;
        double costofinal = precio + costoIva;
        JOptionPane.showMessageDialog(null,"El precio del producto seleccionado es: "+ precio+
                " y el costo final del producto con el iva es de "+costofinal);
    }
}
