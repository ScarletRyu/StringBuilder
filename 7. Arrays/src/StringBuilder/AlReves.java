package StringBuilder;

import java.util.Scanner;

public class AlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce frase para darle la vuelta: ");
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
        System.out.println("La frase al reves es: ");
        System.out.println(sb.reverse().toString());
	}

}
