package Ejercicio2;

public class Producto {

	private String fechaCaducidad;
	private int numeroLote;

	// Constructores

	public Producto() {
		fechaCaducidad = "";
		numeroLote = 0;
	}

	public Producto(String fechaCaducidad, int numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}

	// Setters y Getters
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	// Método que muestra la información del producto
	public void mostrarInformacion() {
		System.out.println("Fecha de Caducidad: " + fechaCaducidad);
		System.out.println("Numero de Lote: " + numeroLote);
	}

	// toString()
	@Override
	public String toString() {
		return "fechaCaducidad: " + fechaCaducidad + " | numeroLote: " + numeroLote;
	}

}
