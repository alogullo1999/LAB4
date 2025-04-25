package Ejercicio1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Exepciones.ExcepcionCampoVacio;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class V_Ejercicio1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecha;
	private JLabel lblDatosIngresados;
	private JButton btnMostrar;

	public V_Ejercicio1() {
		setTitle("Ejercicio 1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		txtNombre = new JTextField();	
		txtNombre.setBounds(148, 38, 215, 20);
		contentPane.add(txtNombre);
		
		//validar el ingreso solo de letras
		soloLetras(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(148, 69, 215, 20);
		contentPane.add(txtApellido);
		
		//validar el ingreso solo de letras
		soloLetras(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(148, 100, 215, 20);
		contentPane.add(txtTelefono);
		
		//validar el ingreso solo de numeros
		soloNumeros(txtTelefono);
		
		
		txtFecha = new JTextField();
		txtFecha.setBounds(148, 131, 215, 20);
		contentPane.add(txtFecha);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(70, 38, 60, 20);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(70, 69, 60, 20);
		contentPane.add(lblApellido);

		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(70, 100, 60, 20);
		contentPane.add(lblTelefono);

		JLabel lblFecha = new JLabel("Fecha (dd/MM/yyyy):");
		lblFecha.setBounds(20, 131, 120, 20);
		contentPane.add(lblFecha);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(274, 162, 89, 23);
		contentPane.add(btnMostrar);

		lblDatosIngresados = new JLabel("Datos Ingresados:");
		lblDatosIngresados.setBounds(20, 220, 390, 14);
		contentPane.add(lblDatosIngresados);

		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					validarCampos();
					
					// Validar fecha ingresada
					if (!fechaValida(txtFecha)) {
					    return;
					}	
					
					lblDatosIngresados.setText(
							"Datos Ingresados: " + txtNombre.getText().trim() + " - " + txtApellido.getText().trim()
									+ " - " + txtTelefono.getText().trim() + " - " + txtFecha.getText().trim());
					
					limpiarCampos();
		            
				} catch (ExcepcionCampoVacio ex) {
					JOptionPane.showMessageDialog(V_Ejercicio1.this, ex.getMessage(), "Error de Validación",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	private void validarCampos() throws ExcepcionCampoVacio {

		String nombre = txtNombre.getText().trim();
		String apellido = txtApellido.getText().trim();
		String telefono = txtTelefono.getText().trim();
		String fecha = txtFecha.getText().trim();
		String campo = "";

		if (nombre.isEmpty()) {
			txtNombre.setBackground(Color.RED);
			campo = "Nombre";
		} else {
			txtNombre.setBackground(Color.WHITE);
		}

		if (apellido.isEmpty()) {
			txtApellido.setBackground(Color.RED);
			campo += campo.isEmpty() ? "Apellido" : ", Apellido";
		} else {
			txtApellido.setBackground(Color.WHITE);
		}

		if (telefono.isEmpty()) {
			txtTelefono.setBackground(Color.RED);
			campo += campo.isEmpty() ? "Teléfono" : ", Teléfono";
		} else {
			txtTelefono.setBackground(Color.WHITE);
		}

		if (fecha.isEmpty()) {
			txtFecha.setBackground(Color.RED);
			campo += campo.isEmpty() ? "Fecha" : ", Fecha";
		} else {
			txtFecha.setBackground(Color.WHITE);
		}

		if (!campo.isEmpty())
			throw new ExcepcionCampoVacio("Campo " + campo + " estan vacíos, Verificar");
	}
	
	private void limpiarCampos() {
		txtNombre.setText("");
		txtApellido.setText("");
		txtTelefono.setText("");
		txtFecha.setText("");
	}
	
	//validar el ingreso de los numeros
	public void soloNumeros(JTextField campo) {
	    campo.addKeyListener(new KeyAdapter() {
	        public void keyTyped(KeyEvent e) {
	            char c = e.getKeyChar();
	            if (!Character.isDigit(c)) {
	                e.consume();
	            }
	        }
	    });
	}
	
	//validar el ingreso de letras
	public static void soloLetras(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume();
                }
            }
        });
    }
	
	public static boolean fechaValida(JTextField campo) {
        String texto = campo.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // evita aceptar cosas como 32/13/2023

        try {
            sdf.parse(texto);
            campo.setBackground(Color.WHITE);
            return true;
        } catch (ParseException e) {
            campo.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Ingresar una fecha válida");
            return false;
        }
    }

}