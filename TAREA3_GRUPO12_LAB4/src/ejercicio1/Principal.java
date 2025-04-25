package ejercicio1;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt"); 

		
		List<Persona> personas = archivo.lee_lineas();

		
		archivo.setRuta("Resultado.txt"); 
		for (Persona persona : personas) {
			archivo.escribe_lineas(persona.toString());
		}

		System.out.println("Personas escritas en Resultado.txt");


	}

}
