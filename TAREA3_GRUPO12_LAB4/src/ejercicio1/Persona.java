package ejercicio1;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	
	private String Nombre; 
	private String Apellido;
	private String Dni;
	
	//Constructor 1
	public Persona(String Nombre,String Apellido,String Dni) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Dni = Dni;
	}
	
	//Constructor 2
	public Persona() {
		this.Nombre="Sin nombre";
		this.Apellido="Sin apellido";
		this.Dni="";
	}

	@Override
	public int hashCode() {
		return Objects.hash( Dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return  Objects.equals(Dni, other.Dni);
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Dni=" + Dni + "]";
	}
	
	
	@Override
	public int compareTo(Persona otra) {
		return this.Apellido.compareToIgnoreCase(otra.Apellido); 
	}
	
	
}
