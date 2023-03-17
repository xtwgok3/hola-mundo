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
 * Ejercicio 1_guia_
 */
public class Guia3_EJ_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //leer inicializacion
        System.out.println("Ingrese un valor entero: ");
        int num1, num2;
        num1=leer.nextInt();
        System.out.println("Ingrese otro valor");  //escribir
        num2=leer.nextInt();    // leer
        
        mostrarOpciones();
        calculadora(num1,num2);
    }
    public static void mostrarOpciones(){ //funcion1 sin retorno (void)
            System.out.println("1 - Sumar ");
            System.out.println("2 - Restar ");
            System.out.println("3 - Multiplicar ");
            System.out.println("4 - Dividir ");
}
    public static void calculadora(int num1, int num2){ // funcion2 sin retorno (void)
        Scanner leer = new Scanner(System.in); //leer inicializacion
        int opcion;
        opcion=leer.nextInt(); //leer
        switch (opcion) { ///segun
            case 1:
                System.out.println("La suma Es: "+(num1+num2));
                break;      //evita que pase a la siguiente linea
            case 2:
                System.out.println("La resta es: "+ (num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion es: "+ (num1*num2));
                break;
            case 4:
                System.out.println("La division es: "+(num1/num2));
                break;
            case 5:
                //salir
                System.out.println("Desea salir?");
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }
}