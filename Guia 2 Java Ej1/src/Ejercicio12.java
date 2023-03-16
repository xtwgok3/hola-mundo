
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyouma
 * (8). Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos
 */
public class Ejercicio12 {
    public static void main(String[] args) {
               Scanner leer = new Scanner(System.in);
               int columna;
               int filas;
               int num;
               System.out.print("Escribe un numero: ");
               num=leer.nextInt();
               
               for (columna=1;columna<=num;columna++) {
                   for (filas=1;filas<=num;filas++) {
                       if ((columna>1) && (columna<num) && (filas>1) && (filas<num)) {
                           System.out.print(" ");
                       } else {
                           System.out.print("*");
				}
			}
			
			System.out.println("");
		}
		 System.out.print("");
	}


}