/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "_1_NUMERO_IGUAL_ASTERISCOS_.java."

import java.io.*;

public class _1_numero_igual_asteriscos_ {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int c;
		int i;
		int num;
		c = 0;
		do {
			num = Integer.parseInt(bufEntrada.readLine());
			while ((num<=0) || (num>20)) {
				System.out.println("Ingrese un número entre 1 y 20");
				num = Integer.parseInt(bufEntrada.readLine());
			}
			for (i=0;i<=num;i++) {
				if (i<1) {
					System.out.print(num);
				} else {
					System.out.print(" *");
				}
			}
			System.out.println("");
			c = c+1;
		} while (c!=5);
	}


}

