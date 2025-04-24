package com.educas.resolCastaneiraE;

import java.time.LocalDate;

public class Ejercicio17 {
    public static void ejercicio17(){
        LocalDate fechaInicial = LocalDate.of(1999,06,10);
        LocalDate fechaHoy = LocalDate.now();

        int dias = 0;
        // while (fechaInicial.isBefore(fechaHoy)){

        //     fechaInicial =  fechaInicial.plusDays(1);
        //     dias++;
        // }

        for (LocalDate fecha = fechaInicial; !fecha.isAfter(fechaHoy); fecha = fecha.plusDays(1)) {
            dias++;
        }

        //  long dias = ChronoUnit.DAYS.between(fechaInicial, fechaHoy);

        System.out.println("Llevas "+dias+" de vida.");
    }
}
