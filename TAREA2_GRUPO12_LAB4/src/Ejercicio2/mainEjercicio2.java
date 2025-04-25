package Ejercicio2;

public class mainEjercicio2 {
    public static void main(String[] args) {
    	
    	ProductoCongelado prodCongelado = new ProductoCongelado("2026-01-01", 100, -18);
    	
    	ProductoFresco prodFresco = new ProductoFresco("2025-05-01", 101, "2025-04-01", "Argentina");
        
    	ProductoRefrigerado prodRefrigerado = new ProductoRefrigerado("2025-06-01", 102, "COD001");
        

        System.out.println("----- Producto Fresco -----");
        prodFresco.mostrarInformacion();
        
        System.out.println("\n ----- Producto Refrigerado -----");
        prodRefrigerado.mostrarInformacion();
        
        System.out.println("\n----- Producto Congelado -----");
        prodCongelado.mostrarInformacion();
    }
}