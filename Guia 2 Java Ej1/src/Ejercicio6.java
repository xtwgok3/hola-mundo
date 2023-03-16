
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * (1). Crear un programa que dado un número determine si es par o impar
 */
public class Ejercicio6 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        if ( num1 %2 == 0 ){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
}
    }
