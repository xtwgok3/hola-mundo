
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
public class Xtra3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese una Letra: ");
        String vocal;
        vocal = leer.next().toLowerCase();
         if (vocal.equals("a")|| vocal.equals("e")|| vocal.equals("i")||vocal.equals("o")||vocal.equals("u")) {
            System.out.println("correcto");
            
        }else { System.out.println("incorrecto");
            
        }  
        
        
    }
    
}