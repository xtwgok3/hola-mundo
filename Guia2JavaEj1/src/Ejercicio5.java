
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
public class Ejercicio5 {
        public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int contador = 0;
        int sum  = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            contador ++;
            if (num>0 ){
                sum = sum + num;
            }else if (num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
           
        } while (contador<20 );
        System.out.println("La suma de los numeros es " + sum);
               
    }
}