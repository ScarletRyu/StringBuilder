package Packageta777;

import java.util.Scanner;

public class Repetigeta777 {

	public static void main(String[] args) {
		/*Crea un programa que pida su nombre al usuario tantas veces como sea necesario, hasta que escriba "nacho" 
		 *(o el nombre que tú prefijes en el programa). Deberá permitir que ese nombre se introduzca tanto en mayúsculas como
		en minúsculas. Cuando introduzca el nombre correcto, se le saludará y terminará el programa 
		*/

		Scanner scan = new Scanner (System.in);
		String str = "vegeta777";
		String stringrex = "";
		
		 do {
			 System.out.print("Introduce el nombre vegeta777: ");
			 stringrex = scan.nextLine();
			 
		} while (!stringrex.equalsIgnoreCase(str));
		 System.out.print("Saludos");
		 
		 
	}

}
