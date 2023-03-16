
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * (4). Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase=leer.nextLine();
        if (frase.substring(0,1).equalsIgnoreCase("a") ) {
            System.out.print("La frase es correcta: "+frase);
        } else {
            System.out.print(frase+ " Frase incorrecta ");
        }
    }
}
