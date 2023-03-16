
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
public class ejercicio2 {
    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor:");
        opcion = leer.nextInt();
                
        switch (opcion) {
            case 1:
                System.out.println("la bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                 System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}
