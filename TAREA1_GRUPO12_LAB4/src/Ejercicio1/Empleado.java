package Ejercicio1;

//Clase Empleado
public class Empleado {
	
	//Variable de la clase que almacena el ID siguiente a agregar
	private static int proximoID = 1000;
	
	
	//Declaracion de Atributos de la clase
	private final int id;
	private String nombre;
	private int edad;

	//Constructor 1
	public Empleado() {
		this.id = proximoID++;
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	
	//Constructor 2
	public Empleado(String nombre, int edad) {
		this.id = proximoID++;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//GETTERS Y SETTERS
	
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
	
	
	//Método estático
	public static int devuelveProximoID() {
		return proximoID;
	}


	@Override
	public String toString() {
		return "Id empleado: " + id + " | Nombre: " + nombre + " | Edad:" + edad;
	}
	
	
	
}
