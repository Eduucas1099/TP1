package com.educas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int nro = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = nro * i;
            System.out.println(nro + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
