package Packageta777;

import java.util.Scanner;

public class Mayusgeta777 {

	public static void main(String[] args) {
		/* Crea un programa que pida su nombre al usuario y lo escriba con la primera letra en mayúsculas
		y el resto en minúsculas. Por ejemplo, a partir de "nAcho" escribirá "Nacho".
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce uan frase: ");
		String str = "";
		str = scan.nextLine();
		
		for (int i = 0; i <= str.length(); i++) {
			str = str.substring(0, 1).toUpperCase() + str.substring(1);
		}
		System.out.print(str);
	}

}
