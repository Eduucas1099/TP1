package com.educas.resolCastaneiraE;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10(){
        Scanner pass = new Scanner(System.in);

        System.out.println("Ingrese contraseña: ");

        String password = pass.nextLine();

        int cantMayus = 0;
        int cantMinus = 0; 
        int cantNum = 0;
        
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    cantMayus++;
                }else if(Character.isLowerCase(password.charAt(i))){
                    cantMinus++;
                }else if(Character.isDigit(password.charAt(i))){
                    cantNum++;
                }
            }

            if (cantMayus >= 2 && cantMinus >=3 && cantNum >=2 ) {
                System.out.println("La contraseña es segura");
            }else{
                System.out.println("La contraseña NO es segura");
            }
        }else{
            System.out.println("La contraseña no tiene una longitud de 8 carácteres.");
        }
        
    }
}
