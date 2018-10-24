package Packageta777;

import java.util.Scanner;

public class Espacieta777 {

	public static void main(String[] args) {
		/* Crea un programa que pida su nombre al usuario y lo escriba con un espacio entre cada par de letras. Por ejemplo, 
		a partir de "Nacho" escribiría "N a c h o " (Pista: tendrás que usar "charAt" y un bucle "for") */

		Scanner scan = new Scanner(System.in);
		
		String nombre = "";
		System.out.print("Introduce un nombre: ");
		nombre = scan.nextLine();
		
		for (int i=1; i<=nombre.length(); i++) {
			System.out.print(nombre.charAt(i) +" ");
		}
		
		
		
	}

}

