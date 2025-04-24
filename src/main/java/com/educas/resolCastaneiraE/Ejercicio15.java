package com.educas.resolCastaneiraE;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio15 {
    public static void ejercicio15(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaCumpleanios = LocalDate.of(2024,06,10);

        if(fechaCumpleanios.isBefore(fechaActual)){
            fechaCumpleanios = fechaCumpleanios.plusYears(1);
        }

        Period period = Period.between(fechaActual, fechaCumpleanios);

        System.out.println("Falta para tu cumpleaños: Días: "+ period.getDays()+ " | Meses: "+ period.getMonths() + " | Años: "+ period.getYears());
    }
}
