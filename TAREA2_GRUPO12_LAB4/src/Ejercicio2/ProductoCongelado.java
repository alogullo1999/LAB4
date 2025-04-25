package Ejercicio2;

public class ProductoCongelado extends Producto  {

	private int tempCongelacionRecomendada;
	
	//Constructor 1
	public ProductoCongelado() {
		super();
		this.tempCongelacionRecomendada = 0;
	}
	
	//Constructor 2
	public ProductoCongelado(String fechaCaducidad,int numeroLote, int temp) {
		super(fechaCaducidad,numeroLote);
		this.tempCongelacionRecomendada = temp;
	}

	public int getTempCongelacionRecomendada() {
		return tempCongelacionRecomendada;
	}

	public void setTempCongelacionRecomendada(int tempCongelacionRecomendada) {
		this.tempCongelacionRecomendada = tempCongelacionRecomendada;
	}

	@Override
	public String toString() {
		return "Producto Congelado numero de lote= "+getNumeroLote()+" Fecha caducidad:"+getFechaCaducidad() +" Temperatura de congelacion recomendada= " + tempCongelacionRecomendada + "";
	}
	
	
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Temperatura de congelación recomendada: " + tempCongelacionRecomendada);
	}
	
	
}
