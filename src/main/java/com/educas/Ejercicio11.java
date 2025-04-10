package com.educas;

import java.util.Scanner;

public class Ejercicio11 {
    public static void ejercicio11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de veces que quiere que salga fibonacci");
        int nro = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i <= nro; i++) {
            System.out.print(n1 +" - ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3; 
        }
        scanner.close();
    }
}
