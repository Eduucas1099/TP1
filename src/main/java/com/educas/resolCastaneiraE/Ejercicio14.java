package com.educas.resolCastaneiraE;

public class Ejercicio14 {
    public static void mostrar(){
        int[][] arrayInitial = {
            {1,2,0,3,0,7},
            {0,0,0,0},
            {0,6,9,8,0,9,6},
            {0,0,0,0,7,9,0,0},
            {0,0,0,0,0},
            {8,7,0,8,9,0,8}
        };

        int count = 0;

        System.out.println("ARREGLO INICIAL: ");
        for (int i = 0; i < arrayInitial.length; i++) {
            for (int j = 0; j < arrayInitial[i].length; j++) {
                if(arrayInitial[i][j] != 0 ){
                    System.out.print(arrayInitial[i][j] + " | ");
                   count++;
                }
            } 
            System.out.println();
        }

        int[] arrayNew = new int[count];
        int index = 0;
        for (int i = 0; i < arrayInitial.length; i++) {
            for (int j = 0; j < arrayInitial[i].length; j++) {
                if (arrayInitial[i][j] != 0) {
                    arrayNew[index] = arrayInitial[i][j];
                    index++;
                }
            }
        }

        System.out.println("ARREGLO SIN CEROS: ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i]+"|");
        }
    }
}
