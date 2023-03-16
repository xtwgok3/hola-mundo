
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * (5). Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.

 */
public class Ejercicio10 {
        public static void main(String[] args) {
            int num,sum=0,limite;
            Scanner leer=new Scanner(System.in);
            System.out.print("Ingrese el valor limite: ");
            limite=leer.nextInt();
            do {                
                num=leer.nextInt();
                sum=num+sum;
            } while (sum<limite);
            System.out.println("la suma es: "+sum);
    }
}