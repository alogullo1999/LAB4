package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archivo {

	private String ruta;
	
	public boolean existe() {
		
		File archivo = new File (ruta);
		
		if (archivo.exists())
			return true;
		return false;
	}
	
	public boolean crearArchivo() {
		FileWriter escritura;
		
		try {
			escritura = new FileWriter (ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void escribe_lineas(String frase) {
		try {
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.newLine(); 
			miBuffer.close();
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Persona> lee_lineas() { 

		Set<Persona> personasUnicas = new HashSet<Persona>();
		List<Persona> personasOrdenadas = new ArrayList<Persona>();

		try {
			FileReader entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);

			String linea = miBuffer.readLine(); 
			while (linea != null) {
				String[] partes = linea.split("-");
				if (partes.length == 3) {
					String nombre = partes[0].trim();
					String apellido = partes[1].trim();
					String dni = partes[2].trim();

					try {
						DniInvalido.verificarDniInvalido(dni);
						Persona persona = new Persona(nombre, apellido, dni);
						personasUnicas.add(persona);
					} catch (DniInvalido e) {
						System.out.println(e.getMessage());
					}
				}

				linea = miBuffer.readLine(); 
			}

			miBuffer.close();
			entrada.close();


			personasOrdenadas.addAll(personasUnicas);
			Collections.sort(personasOrdenadas);


		} catch (IOException e) {
			System.out.println("No se encontró el archivo.");
		}
		return personasOrdenadas;
	}
	

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
