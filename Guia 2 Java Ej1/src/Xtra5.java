
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * 5. Una obra social tiene tres clases de socios:
 */
public class Xtra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese una CLASE A, B, C: ");
        int precio;
        String clase;
        clase = leer.next();
        switch (clase.toUpperCase()) {
            case "A":
                System.out.print("Ingrese el costo: $");
                precio=leer.nextInt();
                System.out.println("Precio: $"+precio+" "+"Total a Pagar c/d: $" +precio*0.5);
                break;
            case "B":
                System.out.print("Ingrese el costo: $");
                precio=leer.nextInt();
                System.out.println("Precio: $"+precio+" "+"Total a Pagar c/d: $" +precio*0.75);
                break;
            case "C":
                System.out.print("Ingrese el costo: $");
                precio=leer.nextInt();
                System.out.println("Total a pagar: $"+precio);
                break;
            default:
                System.out.println("No ingreso una Clase válida.");
        }
}
    }