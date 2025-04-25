package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException {

	private static final long serialVersionUID = 1L;
	private final String dni;

	public DniInvalido(String dni) {
		super("Error, DNI '" + dni + "' inválido. Verifica que contenga solo números.");
		this.dni = dni;
	}

	public DniInvalido() {
		this("");
	}

	public String getDni() {
		return dni;
	}

	// pasado en el constructor.

	// Validador de DNI
	public static void verificarDniInvalido(String dni) throws DniInvalido {
		if (!dni.matches("\\d+")) {
			throw new DniInvalido(dni);
		}
	}
}