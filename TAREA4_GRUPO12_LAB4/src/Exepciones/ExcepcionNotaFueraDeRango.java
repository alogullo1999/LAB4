package Exepciones;

public class ExcepcionNotaFueraDeRango extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionNotaFueraDeRango(String mensaje) {
		super(mensaje);
	}
}
