package com.sofka.ejercicio5;

public class Numero {
    int numPar = 0;
    int numImpar = 1;

    public void numeroPar(){
        while(numPar <100)  {
            numPar = numPar+2;
            System.out.print(numPar+" ");
            numImpar = numImpar+2;
        }
    }
    public void numeroImpar(){
        while(numImpar <100) {
            System.out.print(numImpar+" ");
            numImpar = numImpar+2;
        }
    }
}
