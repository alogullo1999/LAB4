package Ejercicio3;

public class Polideportivo implements InstalacionDeportiva, IEdificio {

	private String nombre;
	private double superficie;
	private int tipoDeInstalacion;

	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		super();
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "Nombre del Polideportivo= " + nombre + ", cuenta con una superficie de " + superficie
				+ "mts2, tipo de instalacion: " + tipoDeInstalacion + ".";
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
