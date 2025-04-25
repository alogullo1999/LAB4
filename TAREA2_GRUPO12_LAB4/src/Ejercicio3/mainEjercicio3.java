package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio3 {

	public static void main(String[] args) {

		// LISTA DE EDIFICIOS
		ArrayList<IEdificio> listaEdificios = new ArrayList<>();

		// AGREGO 3 POLIDEPORTIVOS
		listaEdificios.add(new Polideportivo("Poli el Ruso", 2500.0, 1));
		listaEdificios.add(new Polideportivo("Poli Carlos Pelegrini", 1800.5, 2));
		listaEdificios.add(new Polideportivo("Poli del Sur", 3200.75, 1));

		// AGREGO 2 EDIFICIOS DE OFICINAS
		listaEdificios.add(new EdificioDeOficinas(10, 1200.0));
		listaEdificios.add(new EdificioDeOficinas(5, 800.0));

		// RECORRO LA LISTA Y MUESTRO CADA PROPIEDAD CON EL METODO toString() DE CADA
		// CLASE
		Iterator<IEdificio> it = listaEdificios.iterator();
		while (it.hasNext())
			System.out.println(it.next().toString());
	}
}
