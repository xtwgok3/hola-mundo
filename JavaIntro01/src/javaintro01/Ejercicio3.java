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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase=leer.nextLine();
        frase=frase.toUpperCase();
        System.out.println( frase);
       
        System.out.println( frase.toLowerCase());
    }
}
