package Ejercicio2;

public class ProductoFresco extends Producto {

	private String fechaEnvasado;
	private String PaisOrigen;
	
	//Constructor 1
	public ProductoFresco() {
		super();
		this.fechaEnvasado = "Sin fecha";
		this.PaisOrigen = "Argentina";
	}
	
	//Constructor 2
	public ProductoFresco(String fechaCaducidad,int numeroLote,String fechaEnvasado,String PaisOrigen) {
		super(fechaCaducidad,numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.PaisOrigen = PaisOrigen;
	}
	
	
	//Getter y Setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return PaisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "ProductoFresco, Numero de lote: "+getNumeroLote()+", Fecha de envasado: " + fechaEnvasado + ", PaisOrigen=" + PaisOrigen + ", Fehca de caducidad:"+getFechaCaducidad()+".";
	}
	
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Fecha Envasado: " + fechaEnvasado);
		System.out.println("Pais de Origen: " + PaisOrigen);
	}
	
	
	
	
	
	
}
	
	

