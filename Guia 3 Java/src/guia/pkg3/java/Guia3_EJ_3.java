/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.java;

import java.util.Scanner;

/**
 *
 * @author Kyouma
 */
public class Guia3_EJ_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros que desee convertir a otra moneda");
        double euro = leer.nextDouble();
        
        System.out.println("A que moneda desea convertir la cantidad de euros ingresada?");
        System.out.println("Las opciones son: Yenes, Dolares, Libras.");
        String moneda = leer.next().toLowerCase();
        
        convertidor (euro, moneda);
        
    }
    public static void convertidor (double euro, String moneda) {
        switch (moneda) {
            case "yenes":
                euro *= 129.852; 
                System.out.println("La cantidad ingresada de Euros convertido a Yenes es: " + euro);
            break;
            case "dolares":
                euro *= 1.28611;
                System.out.println("La cantidad ingresada de Euros convertido a Dolares es: " + euro);
            break;
            case "libras":
                euro *= 0.86;
                System.out.println("La cantidad ingresada de Euros convertido a Libras es: " + euro);
            break;
            
            default:
                System.out.println("La moneda ingresada no esta dentro de las opciones");
            break;
        }   
    }  
}