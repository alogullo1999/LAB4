package Ejercicio2;

public class ProductoRefrigerado extends Producto {
	private String codigoOrganismo;

	// Constructor con parametros
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo) {
		super(fechaCaducidad, numeroLote);
		this.codigoOrganismo = codigoOrganismo;
	}

	// Constructor sin parametros
	public ProductoRefrigerado() {
		super();
		this.codigoOrganismo = "Desconocido";
	}

	// Getter y setter
	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	// Metetodo sobrescrito que muestra la informacion del producto refrigerado
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Código del Organismo de Supervisión: " + codigoOrganismo);
	}
}