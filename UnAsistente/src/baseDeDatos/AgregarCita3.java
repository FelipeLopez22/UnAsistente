package baseDeDatos;

import java.util.Scanner;

import tiposDeFuente.Cita3;
import tiposDeFuente.CitaLibro3;

public class AgregarCita3 {
	
	//Atributo el ID de la cita. 
	
	static void Agregar() {	
	Scanner scan=new Scanner(System.in);	
	System.out.println("Ingrese los datos de la cita");
	Cita3[] cArray= new Cita3[1000];
	// Un arreglo para el ID de las citas
	String t= "";
	int contador=1;
	//Switchcase para elegir la fuente.
	//aquí elegí libro
	do {Cita3 c1= new CitaLibro3();
		System.out.println("Digite el apellido del autor");
		String ApellidoAutor= scan.nextLine();
		c1.setApellidoAutor(ApellidoAutor); 
		
		System.out.println("Digite el ano de la edición");
		String Ano= scan.nextLine();
		c1.setAno(Ano);
		
		System.out.println("Digite la Editorial");
		String Editorial= scan.nextLine();
		c1.setEditorial(Editorial);
		
		System.out.println("Esta es la visualización de la referencia");
		CitaLibro3.imprimir();
		
		System.out.println("si quiere terminar digite t");
		t= scan.nextLine();
		cArray[contador]=c1;
		contador++;
		
	} while (!t.equalsIgnoreCase("t"));
	scan.close();
	
}}