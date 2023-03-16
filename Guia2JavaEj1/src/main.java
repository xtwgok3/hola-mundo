
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
public class main {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese otro valor: ");
        num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println("Al menos uno de los numeros es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
           }  
 }
     }