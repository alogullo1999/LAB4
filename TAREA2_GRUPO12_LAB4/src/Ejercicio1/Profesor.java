package Ejercicio1;

import java.util.Objects;

public class Profesor extends Empleado implements Comparable<Profesor> {
	
	
	//Declaracion de Atributos de la clase nueva (Empleado)
	 private String cargo;
	 private int antiguedadDocente;
	 
	 //CONSTRUCTOR 1
	 public Profesor() {
		 super();
		 this.cargo="Sin cargo";
		 this.antiguedadDocente=5;
	 }
	 
	 //CONSTRUCTOR 2
	 public Profesor(String nombre,int edad,String cargo,int antiguedadDocente) {
		 super(nombre,edad);
		 this.cargo=cargo;
		 this.antiguedadDocente=antiguedadDocente;
	 }
	 	 
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public String toString() {
		return "Profesor ID:" + getId()+ ", Nombre: "+ getNombre() +", Edad:"+ getEdad() +", Cargo=" + cargo + ", Antiguedad Docente= " + antiguedadDocente + ".";
	}

	@Override
	public int compareTo(Profesor otro) {
	    return this.getNombre().compareTo(otro.getNombre()); 
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return antiguedadDocente == other.antiguedadDocente && Objects.equals(cargo, other.cargo);
	}
	
	
	
}
