package com.sofka.ejercicio3;

import javax.swing.JOptionPane;
import java.lang.Math;
public class Area {
    double area, radio;

    public void solicitarParametros(){
        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el radio"));
    }
    public void calcularArea(){
        area = Math.PI*Math.pow(radio,2);
        JOptionPane.showMessageDialog(null,"El area del cirulo es: "+area);
    }
}

