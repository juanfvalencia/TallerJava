package com.sofka.ejercicio13;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class fechaHora {
    public void validarFechaHora(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("La fecha actual es " + dateFormatter.format(date) +" y la hora actual es "+ timeFormatter.format(time));
    }
}
