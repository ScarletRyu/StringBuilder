package StringBuilder;

import java.util.Scanner;

public class Don {

	public static void main(String[] args) {
		/* Crea un programa que pida su nombre al usuario y cree una nueva cadena de texto formada por "Don " seguido del nombre.
		Hazlo de dos formas: primero concatenando dos cadenas y luego usando "insert" en un StringBuilder.
*/
		
		/* Scanner scan = new Scanner (System.in);
		 System.out.print("Dame tu nombre: ");
		 String nombre = scan.nextLine();
		 
		 String str = "Don";
		 
		 
		 System.out.println("str " +nombre);
	}

}
*/
		

//StringBuilder

Scanner scan = new Scanner (System.in);
System.out.print("Dame tu nombre: ");
String nombre = scan.nextLine();

StringBuilder sb = new StringBuilder(nombre);

sb.insert(0, "Don ");
System.out.print(sb);

	}
}

