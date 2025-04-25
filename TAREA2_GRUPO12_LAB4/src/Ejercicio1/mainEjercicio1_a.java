package Ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {

		ArrayList<Profesor> profesores = new ArrayList<>();
		
		profesores.add(new Profesor("Mauro", 40, "Titular", 15));
        profesores.add(new Profesor("Mariano", 35, "Adjunto", 10));
        profesores.add(new Profesor("Franco", 50, "Jefe", 25));
        profesores.add(new Profesor("Guido", 30, "Asociado", 5));
        profesores.add(new Profesor("Adrian", 45, "Titular", 20));
        
        ListIterator<Profesor> it = profesores.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }

	}

}
