package com.educas.resolCastaneiraE;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class Ejercicio16{
    public static void ejercicio16(){

        LocalDate fechaInicial = LocalDate.of(2025,01,01);
        LocalDate fechaFinal = LocalDate.of(2025,12,31);

       int count = 0;

       while(!fechaInicial.isAfter(fechaFinal)){
            DayOfWeek dia = fechaInicial.getDayOfWeek();

            if(dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY){
                count++;
            }
            fechaInicial = fechaInicial.plusDays(1);
       }

       System.out.println("El año " + fechaInicial.getYear()+ " tiene "+count+ " fines de semana.");
    }
}
