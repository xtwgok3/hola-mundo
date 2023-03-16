
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
public class Xtra1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int min;
        int horas;
        int dias;
        System.out.print("Ingrese los minutos: ");
        min= leer.nextInt();
        horas=min/60;
        dias=horas/24;
        horas=horas % 24;
        System.out.println("Dias "+dias+" Horas:"+horas);
    }
    
    
    
}