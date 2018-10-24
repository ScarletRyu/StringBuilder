package Packageta777;

import java.util.Scanner;

public class Alreveseta777 {

	public static void main(String[] args) {
		// Crea un programa que pida su nombre al usuario y lo escriba con al revés. Por ejemplo, a partir de "Nacho" escribiría "ohcaN

	
		System.out.print("Introduce frase para revertir: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String reverse = "";
		
		for(int i = str.length() -1; i >=0; i--) {
			reverse = reverse + str.charAt(i);
			
			
		}
		System.out.print(reverse);
		
		
    }
}