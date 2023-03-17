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
public class Guia3_EJ_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int edad;  
        int menorEdad= 0;
        int mayorEdad=0;
        int contador=0;
        String nombre;
        System.out.println("INGRESE LA CANTIDA DE PERSONAS");
        int cantidad = leer.nextInt(); 
         //  para i  = 0; hasta cantidad; con paso 1
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese el nombre de la persona: ");
                nombre = leer.next();
                System.out.print("ingrese la edad de "+nombre.toUpperCase()+" :");
                edad = leer.nextInt();          
                mayorEdad = mayorEdad + edad;  //
                if (edad<18) {
                  contador++;
                  menorEdad = menorEdad+edad; // contadorPersonas = contadorPersonas + 1; 
                    System.out.println("Es menor de Edad.");
                 } else {
                           System.out.println("Es mayor de Edad.");
				}
                    
                }
        }
           // System.out.println("el promedio de edad Menores es "+(menorEdad/contador));
           // System.out.println("el promedio de edad Mayores es "+(mayorEdad/cantidad));
    }
    
