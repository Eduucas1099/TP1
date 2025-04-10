package com.educas;

import java.util.Scanner;

public class Ejercicio4 {
    public static void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese alguna palabra: ");
        String palabra = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.toLowerCase().charAt(i) == 'a' || 
            palabra.toLowerCase().charAt(i) == 'e' || palabra.toLowerCase().charAt(i) == 'i' || palabra.toLowerCase().charAt(i)== 'o' || palabra.toLowerCase().charAt(i) == 'u' ) {
                count ++;
            }            
        }

        System.out.println("Hay "+ count + " vocales");
    }
}
