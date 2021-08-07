package baseDeDatos;

import java.util.Scanner;

public class Menu {

	static void Seleccionar(){
		System.out.println("Digite: N para crear una cita, C para consultar una cita");
		Scanner scanMenu = new Scanner(System.in);
		String Opcion = scanMenu.nextLine();
		
		
		switch (Opcion) {
		case "N":ElegirTipo();
			break;
		case "C":ConsultarCita.Consultar();

			break;

		default:System.out.println("Vuelva a iniciar usando mayusculas");
			break;
		}
		scanMenu.close();

		}
	
	
	//Función saludar
	public static String Saludar(String Usuario) {

		String Bienvenida = "Hola " + Usuario;
		return Bienvenida;}

	
	
	
	// Metodo
	static void ElegirTipo() {

		// El usuario elige el tipo de referencia
		String TipoCita=" ";
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite: D para una cita directa, y P para una cita parafraseada");// Agregar digite ID 
		TipoCita = scan.nextLine();
		switch (TipoCita) {
		case "D":
			System.out.println("Digite: H para una cita narrativa, y T para una cita entre paréntesis");
			String TipoDirecta = scan.nextLine();
			switch (TipoDirecta) {
			case "H":
				System.out.println("Digite: L para una cita de más de 40 palabras, y C para una cita de menos de 40 palabras");
				String Extension = scan.nextLine();
				switch (Extension) {
				case "L":// Ejecutar base de datos con una identidad de cita, dirige a una clase base de
							// datos con atributo el ID, y metodo el agregar
					AgregarCita.Agregar();
					break;
				case "C":
					AgregarCita3.Agregar();
					break;
				default:System.out.println("Vuelva a iniciar usando mayusculas");
					break;
				}

				break;
			case "T":System.out.println("Digite: L para una cita de más de 40 palabras, y C para una cita de menos de 40 palabras");
			String Extension2 = scan.nextLine();
			switch (Extension2) {
			case "L":// Ejecutar base de datos con una identidad de cita, dirige a una clase base de
						// datos con atributo el ID, y metodo el agregar
				AgregarCita2.Agregar();
				break;
			case "C":
				AgregarCita4.Agregar();
				break;
			default:System.out.println("Vuelva a iniciar usando mayusculas");
				break;
			}

			break;
			}
			break;
			

		case "P": System.out.println("Digite: H para una cita narrativa, y T para una cita entre paréntesis");
		String TipoParafraseada = scan.nextLine();
		switch (TipoParafraseada) {
		case "H":
			System.out.println("Digite: L para una cita de más de 40 palabras, y C para una cita de menos de 40 palabras");
			String Extension2 = scan.nextLine();
			switch (Extension2) {
			case "L":// Ejecutar base de datos con una identidad de cita, dirige a una clase base de
						// datos con atributo el ID, y metodo el agregar
				AgregarCita.Agregar();
				break;
			case "C":
				AgregarCita3.Agregar();
				break;
			default:System.out.println("Vuelva a iniciar usando mayusculas");
				break;
			}
			break;
		case "T":System.out.println("Digite: L para una cita de más de 40 palabras, y C para una cita de menos de 40 palabras");
		String Extension3 = scan.nextLine();
		switch (Extension3) {
		case "L":// Ejecutar base de datos con una identidad de cita, dirige a una clase base de
					// datos con atributo el ID, y metodo el agregar
			AgregarCita2.Agregar();
			break;
		case "C":
			AgregarCita4.Agregar();
			break;
		default:System.out.println("Vuelva a iniciar usando mayusculas");
			break;
		}
		default:System.out.println("Vuelva a iniciar usando mayusculas");
			break;
		}

		scan.close();

	}
	}
}
