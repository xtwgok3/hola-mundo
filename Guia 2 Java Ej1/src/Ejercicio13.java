
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * (7). Realizar un programa que simule el funcionamiento de un dispositivo
RS232, e
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una palabra");
        String palabra=leer.next();
        int correcto = 0, incorrecto = 0;
        
        while (!palabra.equals("&&&&&")){
        int tam = palabra.length();
        
        String p = palabra.substring(0,1);
            String pF = palabra.substring(tam-1, tam);
        if (tam == 5 && p.equals("x") && pF.equals("o")){
            correcto++;
            } else{
            incorrecto++;
        }
        System.out.println("Ingrese una palabra");
        palabra=leer.next();
        } 
       System.out.println("La cantidad de ingresos correctos fueron: " + correcto + " y los incorrectos fueron: " + incorrecto);
    }
}