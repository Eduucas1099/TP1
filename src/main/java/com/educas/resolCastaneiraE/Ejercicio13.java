package com.educas.resolCastaneiraE;

public class Ejercicio13 {
    public static void ejercicio13(){
        String [] alumnos = {"Eduardo", "Matías", "Ricardo"};

        double [][] notas = {
            {7.0,5.0,6.0},
            {5.0,4.0,6.0},
            {10.0,9.0,3.0}
        };


        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: "+ alumnos[i]);
            double suma =0.0;
           
            for (int j = 0; j < notas.length; j++) {
                suma += notas[i][j];
                System.out.print("Notas: "+notas[i][j] + " | ");
            }
            System.out.println("Promedio: "+suma / notas.length);
        }
    }
}
