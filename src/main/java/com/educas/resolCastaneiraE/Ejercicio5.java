package com.educas.resolCastaneiraE;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese alguna palabra: ");
        String palabra = scanner.nextLine();
        String alReves = "";
        for (int i = palabra.length()-1; i >= 0; i--) {
            char letra = palabra.charAt(i);
            alReves += letra;
        }
        
        if (alReves.equals(palabra)) {
            System.out.println("La palabra "+palabra+ " es palíndroma");
        }else{
            System.out.println("La palabra "+palabra+ " no es palíndroma");
        }
        scanner.close();
    }
}
