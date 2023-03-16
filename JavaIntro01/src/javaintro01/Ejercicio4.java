/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Kyouma
 */
public class Ejercicio4 {
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
        int C;
        System.out.print("Ingrese la Temperatura:");
        C=leer.nextInt();
        int F;
        F= 32+ (9 * C / 5);
        System.out.println("Grados:"+C+"°C"+ " " + " Grados: " + F+"°F");
}
}