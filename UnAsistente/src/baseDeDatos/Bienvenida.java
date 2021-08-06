package baseDeDatos;

import java.util.Scanner;

public class Bienvenida {

	public static void main(String[] args) {
		System.out.println("Digite su usuario");
		Scanner scan = new Scanner(System.in);
		String Usuario = scan.next();
		System.out.println(Menu.Saludar(Usuario));
		Menu.Seleccionar();
		scan.close();
	}
		 
		 
	
	
	  

	

}
