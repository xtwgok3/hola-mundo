
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 */
public class Xtra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int altura;  
        int sumadorEstaruasMin= 0;
        int sumadorEstaturasMax=0;
        int contador=0;
        System.out.println("INGRESE LA CANTIDA DE PERSONAS");
        int cantidad = leer.nextInt(); 
         //  para i  = 0; hasta cantidad; con paso 1
            for (int i = 0; i < cantidad; i++) {
                System.out.println("ingrese la altura de la persona "+(i+1));
                altura = leer.nextInt();          
                sumadorEstaturasMax = sumadorEstaturasMax + altura;  //160+120+180+
                if (altura<160) {
                  contador++;
                  sumadorEstaruasMin = sumadorEstaruasMin+altura; // contadorPersonas = contadorPersonas + 1; 
                }
        }
            System.out.println("el promedio de bajitos es "+(sumadorEstaruasMin/contador));
            System.out.println("el promedio de estaturas es "+(sumadorEstaturasMax/cantidad));
    }
    }
