package Ejercicio1;

import java.util.Objects;

//Clase Empleado
public class Empleado {

	// Variable de la clase que almacena el ID siguiente a agregar
	private static int proximoID = 1000;

	// Declaracion de Atributos de la clase
	private final int id;
	private String nombre;
	private int edad;

	// Constructor 1
	public Empleado() {
		this.id = proximoID++;
		this.nombre = "sin nombre";
		this.edad = 99;
	}

	// Constructor 2
	public Empleado(String nombre, int edad) {
		this.id = proximoID++;
		this.nombre = nombre;
		this.edad = edad;
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	// Método estático
	public static int devuelveProximoID() {
		return proximoID;
	}

	@Override
	public String toString() {
		return "Id empleado: " + id + " | Nombre: " + nombre + " | Edad:" + edad;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

}
