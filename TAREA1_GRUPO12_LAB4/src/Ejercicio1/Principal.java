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
		
		vEmp[0] = new Empleado ("Guido",25);
		vEmp[1] = new Empleado ("Juan",32);
		vEmp[2] = new Empleado ();
		vEmp[3] = new Empleado ("Pedro",30);
		vEmp[4] = new Empleado ();
		
		for (Empleado empleado : vEmp) {
			
			System.out.println(empleado.toString());
		}
		//Muestra el proximo ID
		System.out.println("Proximo ID:"+Empleado.devuelveProximoID());
	}


}
