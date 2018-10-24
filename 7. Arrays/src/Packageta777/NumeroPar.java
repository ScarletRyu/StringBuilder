package Packageta777;
import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario un número entero y, si es par, dé el valor "true" 
		a una variable booleana llamada "esPar"; en caso contrario, le dará el valor "false". */

		Scanner scan = new Scanner(System.in);
		boolean esPar = true;
		
		System.out.println("Mete un puto numero: ");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println(esPar);
		}else {
			esPar = false;
			System.out.println(esPar);
		}
		
	} 

}

