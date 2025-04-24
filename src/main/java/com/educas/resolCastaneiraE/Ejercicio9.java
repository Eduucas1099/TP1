package com.educas.resolCastaneiraE;
import java.util.Scanner;

public class Ejercicio9 {
    public static void ejercicio9(){
        Scanner pal = new Scanner(System.in);

        System.out.println("ingrese la palabra");

        String[] texto = pal.nextLine().split(" ");

        int count = 0;
        for (String palabra : texto) {
            if(palabra.contains(".") || palabra.contains(",") || palabra.contains(":")){
                count++;
            }
            count++;
        }

        System.out.println("El texto tiene "+ count + " palabras.");
    }
}
