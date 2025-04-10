package com.educas;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Ingrese el ejercicio");
        int ejercicio = scanner.nextInt();

        switch (ejercicio){
            case 1:
                Ejercicio_1.ejercicio1();
                break;
            case 2:
                Ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3.ejercicio3();
                break;
            case 11: 
                Ejercicio11.ejercicio11();
                break;
        }
        scanner.close();
    }
}
