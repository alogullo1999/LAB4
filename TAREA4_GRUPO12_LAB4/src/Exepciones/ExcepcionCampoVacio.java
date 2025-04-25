package Exepciones;

public class ExcepcionCampoVacio extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionCampoVacio(String mensaje) {
		super(mensaje);
	}
}