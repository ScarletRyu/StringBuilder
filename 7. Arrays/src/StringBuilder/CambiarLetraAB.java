package StringBuilder;

import java.util.Scanner;

public class CambiarLetraAB {

	public static void main(String[] args) {
		/* Crea un programa que pida su nombre al usuario y cambie la primera letra por una "A", 
		 * excepto en el caso de que ya fuera una "A", y entonces se convertiría en una "B". */
		
		 Scanner scan = new Scanner (System.in);
		 System.out.print("Dame tu nombre: ");
		 String str = "";
		 str = scan.nextLine();
		 
		 
		 StringBuilder sb = new StringBuilder(str);
	
		 if (str.charAt(0) == 'a') {
			 sb.setCharAt(0,'b');
			 System.out.println(sb);
		 }else {
			 sb.setCharAt(0,'a');
			 System.out.println(sb);
		 }
	}

}
