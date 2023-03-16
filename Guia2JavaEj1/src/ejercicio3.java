
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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.print("Ingrese una nota: ");
        nota = leer.nextInt();
        while (!(nota>0 && nota <11)) {            
            System.out.println("Ingrese una nota entre 0 a 10");
            nota = leer.nextInt();
            System.out.println("La nota es: "+nota);
        }
        
    }
}
