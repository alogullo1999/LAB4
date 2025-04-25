package Ejercicio3;

public class EdificioDeOficinas implements IEdificio {

	// ATRIBUTOS
	private double superficie;
	private int numeroOficinas;

	// CONSTRUCTORES
	public EdificioDeOficinas() {
		super();
		this.numeroOficinas = 0;
		this.superficie = 0;
	}

	public EdificioDeOficinas(int numeroOficinas, double superficie) {
		super();
		this.numeroOficinas = numeroOficinas;
		this.superficie = superficie;
	}

	// GETTERS Y SETTERS
	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

	@Override
	public String toString() {
		return "Superficie De Edificio: " + superficie + " | Numero de oficinas: " + numeroOficinas;
	}

	@Override
	public double getSuperficieEdificio() {

		return superficie;
	}

}
