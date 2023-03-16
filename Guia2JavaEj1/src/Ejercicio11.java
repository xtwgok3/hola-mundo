
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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,opcion,sum=0;
        String salir;
        boolean salir2=false;
        System.out.println("Ingrese dos valores: ");
        num1=leer.nextInt();
        num2=leer.nextInt();
        do {        
        System.out.println("");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("5 - Salir");
            opcion =leer.nextInt();
            switch (opcion){
                case 1:
                    sum=num1+num2;
                    System.out.println("La suma es: "+sum);
                    break;
                case 2:
                    sum=num1-num2;
                    System.out.println("La resta es: "+sum);
                    break;
                case 3:
                    sum=num1*num2;
                    System.out.println("Multiplicacion: "+sum);
                    break;
                case 4:
                    sum=num1/num2;
                    System.out.println(""+sum);
                    break;
                case 5:
                    System.out.println("Desea salir?");
                    salir=leer.next().toLowerCase();
                    if (salir.equals("s")){
                        salir2=true;
                    }
                    break;
                default:
                    System.out.println("No eligio una opcion correcta");
            }
        } while (!salir2);
    }
}
