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
public class Ejercicio5 {
    public static void main(String[] args) {
        int num;
        System.out.println("ingrese un valor:");
        Scanner leer = new Scanner(System.in);
        num=leer.nextInt();
        System.out.println("El doble: " +num*2);
        System.out.println("El triple: " +num*3);
        System.out.println("La Raiz cuadrada: "+Math.sqrt(num));
    }
}
