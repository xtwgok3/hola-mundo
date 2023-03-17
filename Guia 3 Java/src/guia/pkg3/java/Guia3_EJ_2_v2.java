/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.java;

import java.util.Scanner;

/**
 *
 * @author Kyouma
 */
public class Guia3_EJ_2_v2 {
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            
            imprimir();
          
 }
        public static void imprimir(){
            Scanner leer = new Scanner(System.in);
            String nombre,resp; 
            int edad; 
            
            do{
                System.out.println("Ingresar Nombre de la persona"  );
                nombre = leer.next();
                
                System.out.println("Ingresar edad de la persona"  );
                edad = leer.nextInt();
                
                if (edad>=18){
                    System.out.println("Es mayor de edad");
                } else 
                    System.out.println("Es menor de edad");
                
                System.out.println("¿Desea ingresar otra persona? SI/NO");
                resp = leer.next().toUpperCase();
                
                
            }while (! resp.equals("NO"));
}
}