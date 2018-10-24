package Packageta777;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trianguleta777 {

	public static void main(String[] args) {
		// Crea un programa que escriba un triángulo con las letras de tu nombre, 
		//mostrando primero la primera letra, luego las dos primeras y así sucesivamente, hasta llegar al nombre completo
		
		
		String nombre = "";
		int i;
		System.out.println("Hola, escribe tu nombre: ");
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
 
			nombre = entrada.readLine();
 
			for(i=1;i<=nombre.length();i++)
			{	
				System.out.println(nombre.substring(0,i));
			}
		}
		catch (IOException e){}
	}
}
 
