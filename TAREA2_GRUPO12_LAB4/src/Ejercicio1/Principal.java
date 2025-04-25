/*
 ------------TP1---------
 PARTICIPANTES:
 -Asselborn Mauro.
 -Bonzi Franco Santiago.
 -Criscione Adrian Jose.
 -Logillo Adriel 
 -Sercovich Guido.
 -Stoessel Mariano.
  */
package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado[] vEmp = new Empleado[5];

		vEmp[0] = new Empleado("Guido", 25);
		vEmp[1] = new Empleado("Juan", 32);
		vEmp[2] = new Empleado();
		vEmp[3] = new Empleado("Pedro", 30);
		vEmp[4] = new Empleado();

		for (Empleado empleado : vEmp) {

			System.out.println(empleado.toString());
		}
		// Muestra el proximo ID
		System.out.println("Proximo ID:" + Empleado.devuelveProximoID());

		// Punto 7
		System.out.println("---------------------------");
		System.out.println("Punto 7");
		System.out.println("---------------------------");

		Profesor profesor1 = new Profesor("Juan", 40, "Titular", 10);
		Profesor profesor2 = new Profesor("Paco", 40, "Suplente", 10);

		if (profesor1.equals(profesor2)) {
			System.out.println("Es el mismo profesor.");
		} else {
			System.out.println("No son el mismo profesor.");
		}
	}

}
