package com.educas.resolCastaneiraE;

import java.util.Scanner;

public class Ejercicio12 {
    public static void ejercicio12(){
        /**
         * Crea un programa que:
            1.	Pida al usuario ingresar 5 números enteros.
            2.	Guarde los números en un arreglo.
            3.	Calcule y muestre otro arreglo con los numeros ordenados de mayor a menor.
         */

        
        int [] nros = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < nros.length; i++) {
            nros[i] = scanner.nextInt();  
        } 

        int[] arregloOrdenado = new int[5];
        for (int i = 0; i < nros.length; i++) {          
            for (int j = i+1; j < nros.length; j++) {
                if (nros[i] > nros[j]) {
                    arregloOrdenado[i] = nros[i];   
                }else{
                    arregloOrdenado[i] = nros[j];
                    int num2 = nros[i];                   
                    nros[i] = nros[j];
                    nros[j] = num2;
                }
            }
            System.out.println("Arreglo["+i+"] = "+ arregloOrdenado[i]);
            arregloOrdenado[nros.length -1 ] = nros[nros.length-1];
        }

        System.out.println("Array ordenado: ");
        for (int num : arregloOrdenado) {
            System.out.println(num);
        }
    }
}