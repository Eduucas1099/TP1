package com.educas;

import java.util.Scanner;

public class Ejercicio_1 {
    public static  void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();
        scanner.close();
        System.out.println("Hola " + nombre +"!");
    }
}
