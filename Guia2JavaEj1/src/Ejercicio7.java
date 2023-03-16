
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * (2). Crear un programa que pida una frase y si esa frase es igual a “eureka”
 */
public class Ejercicio7 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase;
        System.out.println("Ingrese una frase");
        frase = leer.next();
        if (frase.equals("eureka")){
            
            System.out.println("La frase es correcta");
        }else{
            System.out.println("La frase es incorrecta");
        }
        
    }
}
