package Ejercicio1;


import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {
    public static void main(String[] args) {
        TreeSet<Profesor> profesores = new TreeSet<>();

        profesores.add(new Profesor("Javier", 40, "Titular", 10));
        profesores.add(new Profesor("Carlos", 50, "Adjunto", 12));
        profesores.add(new Profesor("Diego", 35, "JTP", 7));
        profesores.add(new Profesor("Messi", 45, "Titular", 15));
        profesores.add(new Profesor("Gustavo", 38, "Adjunto", 9));

        Iterator<Profesor> it = profesores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

