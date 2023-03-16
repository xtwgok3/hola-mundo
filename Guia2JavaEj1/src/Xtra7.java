
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
public class Xtra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
		int aux;
		int max;
		int min;
		int num;
		int prom;
		int sum;
		System.out.println("Ingrese n meros");
		num = leer.nextInt();
		aux = 0;
		min = num;
		max = num;
		sum = 0;
		while ((num!=0)) {
			if (num>max) {
				max = num;
			}
			if (num<min) {
				min = num;
			}
			sum = sum+num;
			aux = aux+1;
			num =leer.nextInt();
		}
		prom = sum/(aux);
		System.out.println("El maximo es: ("+max+")");
		System.out.println("El minimo es: ("+min+")");
		System.out.println("La promedio es: ("+prom+")");
    }
            
}
