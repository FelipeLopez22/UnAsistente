package baseDeDatos;

import java.util.Scanner;

import tiposDeFuente.Cita;
import tiposDeFuente.CitaLibro;

public class AgregarCita {
	
	//Atributo el ID de la cita. 
	
	static void Agregar() {	
	Scanner scan=new Scanner(System.in);	
	System.out.println("Ingrese los datos de la cita");
	Cita[] cArray= new Cita[1000];
	// Un arreglo para el ID de las citas
	String t= "";
	int contador=1;
	//Switchcase para elegir la fuente.
	//aquí elegí libro
	do {Cita c1= new CitaLibro();
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
		CitaLibro.imprimir();
		
		System.out.println("si quiere terminar digite t");
		t= scan.nextLine();
		cArray[contador]=c1;
		contador++;
		
	} while (!t.equalsIgnoreCase("t"));
	scan.close();
	//Hola muchachos
	//hola
}}
	
	
	
	

