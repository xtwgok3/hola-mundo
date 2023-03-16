/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String frase;
		frase = bufEntrada.readLine();
		if (frase.substring(0,1).equals("a") || frase.substring(0,1).equals("A")) {
			System.out.println("frase correcta");
		} else {
			System.out.println("frase incorrecta");
		}
		System.out.println(frase.substring(0,1));
	}


}

