/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "GUIA_3_2_MIN_MAX_PROM_V5.java."

import java.io.*;

public class guia_3_2_min_max_prom_v5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double aux;
		double max;
		double min;
		double num;
		double prom;
		double sum;
		System.out.println("Ingrese números");
		num = Double.parseDouble(bufEntrada.readLine());
		aux = 0;
		min = num;
		max = num;
		sum = 0;
		while ((num!=0)) {
			if ((num>max)) {
				max = num;
			}
			if ((num<min)) {
				min = num;
			}
			sum = sum+num;
			aux = aux+1;
			num = Double.parseDouble(bufEntrada.readLine());
		}
		prom = sum/(aux);
		System.out.println("El maximo es: ("+max+")");
		System.out.println("El minimo es: ("+min+")");
		System.out.println("La promedio es: ("+prom+")");
	}


}

