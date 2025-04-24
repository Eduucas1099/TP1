package com.educas.resolCastaneiraE;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6(){
        int numeroRandom = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese algun numero del 1 al 100: ");
        int nro = scanner.nextInt();
        
        while (nro != numeroRandom) {
            if(nro > numeroRandom){        
                System.out.println("Mas bajo");
            }else if(nro < numeroRandom){
                System.out.println("Mas alto");
            }
            nro = scanner.nextInt(); 
        }
        

        System.out.println("Numero adivinado!!!");
        scanner.close();
    }
}
