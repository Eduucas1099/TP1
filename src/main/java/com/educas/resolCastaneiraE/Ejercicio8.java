package com.educas.resolCastaneiraE;

import java.util.Scanner;

public class Ejercicio8 {
    public static void ejercicio8(){
        Scanner lectorTemp = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temperatura = lectorTemp.nextInt();
        Scanner lectorTipo = new Scanner(System.in);
        System.out.println("Ingrese si quiere convertir la temperatura a Celsius(1) o Fahrenheit(2): ");
        int tipo = lectorTipo.nextInt();
        double total;

        switch (tipo) {
            case 1:
                total = ((temperatura - 32) * (5.0/9));
                System.out.println("Temperatura convertida a Celsius: "+ total);
                break;
            case 2:
                total = (temperatura * (9.0/5))+32;
                System.out.println("Temperatura convertida a Fahrenheit : "+ total);
                break;
        
            default:
                System.out.println("ingreso un tipo que no es correcto.");
                break;
        }

        
        lectorTemp.close();
        lectorTipo.close();
    }
}
