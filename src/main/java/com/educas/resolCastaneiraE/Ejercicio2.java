package com.educas.resolCastaneiraE;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int nro = scanner.nextInt();

        if (nro % 2 == 0){
            System.out.println(nro + " es par");
        }else{
            System.out.println(nro + " es impar");
        }
        scanner.close();
    }
}
