package StringBuilder;

import java.util.Scanner;

public class ImparesMayusculas {

	public static void main(String[] args) {
		/* Crea un programa que pida su nombre al usuario y convierta las letras impares a mayúsculas 
		y las pares a minúsculas. Por ejemplo, a partir de la cadena "nAcho" se obtendría "NaChO".
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un nombre : ");
		String str=scan.nextLine(); 	
		String nombre="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);	
			if(i%2==0)			
			ch=Character.toUpperCase(ch);
			nombre=nombre+ch;	
		}
		System.out.println("Nombre cambiado : "+nombre);
	}	
} 	