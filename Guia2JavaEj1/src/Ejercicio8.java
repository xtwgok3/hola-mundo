
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * (3). Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
       String frase;
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        frase = leer.nextLine();
        if (frase.length()==8){
            
            System.out.println("La frase es correcta");
        }else{
            System.out.println("La frase es incorrecta");
        }
}
    }
