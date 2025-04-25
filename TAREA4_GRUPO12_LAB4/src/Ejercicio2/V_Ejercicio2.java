package Ejercicio2;

import javax.swing.*;

import Exepciones.ExcepcionCampoVacio;
import Exepciones.ExcepcionNotaFueraDeRango;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class V_Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField nota1Field, nota2Field, nota3Field, promedioField, condicionField;
	private JComboBox<String> tpsComboBox;

	public V_Ejercicio2() {
		setTitle("Promedio");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		JPanel notasPanel = new JPanel(new GridLayout(4, 2, 5, 5));
		notasPanel.setBounds(48, 11, 197, 117);
		notasPanel.setBorder(BorderFactory.createTitledBorder("Notas del estudiante"));

		notasPanel.add(new JLabel("Nota 1:"));
		nota1Field = new JTextField();
		notasPanel.add(nota1Field);

		notasPanel.add(new JLabel("Nota 2:"));
		nota2Field = new JTextField();
		notasPanel.add(nota2Field);

		notasPanel.add(new JLabel("Nota 3:"));
		nota3Field = new JTextField();
		notasPanel.add(nota3Field);

		notasPanel.add(new JLabel("TPS:"));
		tpsComboBox = new JComboBox<>(new String[] { "Aprobado", "Desaprobado" });
		notasPanel.add(tpsComboBox);

		JPanel botonesPanel = new JPanel(new GridLayout(3, 1, 5, 5));
		botonesPanel.setBounds(266, 25, 96, 94);
		JButton calcularBtn = new JButton("CALCULAR");
		JButton nuevoBtn = new JButton("NUEVO");
		JButton salirBtn = new JButton("SALIR");
		salirBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		salirBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		botonesPanel.add(calcularBtn);
		botonesPanel.add(nuevoBtn);
		botonesPanel.add(salirBtn);

		JPanel resultadoPanel = new JPanel(new GridLayout(2, 2, 5, 5));
		resultadoPanel.setBounds(79, 171, 248, 79);
		resultadoPanel.setBorder(BorderFactory.createTitledBorder("Notas del estudiante"));
		resultadoPanel.add(new JLabel("Promedio:"));
		promedioField = new JTextField();
		promedioField.setEditable(false);
		resultadoPanel.add(promedioField);
		resultadoPanel.add(new JLabel("Condicion:"));
		condicionField = new JTextField();
		condicionField.setEditable(false);
		resultadoPanel.add(condicionField);

		getContentPane().setLayout(null);
		getContentPane().add(notasPanel);
		getContentPane().add(botonesPanel);
		getContentPane().add(resultadoPanel);

		// Accion CALCULAR con validaciones y excepciones
		calcularBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double n1 = validar(nota1Field.getText(), "Nota 1");
					double n2 = validar(nota2Field.getText(), "Nota 2");
					double n3 = validar(nota3Field.getText(), "Nota 3");
					String tp = (String) tpsComboBox.getSelectedItem();

					String Condicion;
					if ("Desaprobado".equals(tp) || n1 < 6 || n2 < 6 || n3 < 6) {
						Condicion = "Libre";
					} else if (n1 >= 8 && n2 >= 8 && n3 >= 8) {
						Condicion = "Promocionado";
					} else {
						Condicion = "Regular";
					}

					double Promedio = (n1 + n2 + n3) / 3;
					promedioField.setText(String.format("%.2f", Promedio));
					condicionField.setText(Condicion);
				} catch (ExcepcionCampoVacio | ExcepcionNotaFueraDeRango ex) {
					JOptionPane.showMessageDialog(V_Ejercicio2.this, ex.getMessage(), "Error",
							JOptionPane.WARNING_MESSAGE);
					promedioField.setText("");
					condicionField.setText("");
				}
			}

			private double validar(String texto, String nombre) throws ExcepcionCampoVacio, ExcepcionNotaFueraDeRango {
				if (texto == null || texto.isBlank())
					throw new ExcepcionCampoVacio(nombre + " vacío");
				Double valor;
				try {
					valor = Double.parseDouble(texto);
				} catch (NumberFormatException ex) {
					throw new ExcepcionNotaFueraDeRango(nombre + " no es numero");
				}
				if (valor < 1 || valor > 10)
					throw new ExcepcionNotaFueraDeRango(nombre + " fuera de 1-10");
				return valor;
			}
		});

		// Accion NUEVO
		nuevoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nota1Field.setText("");
				nota2Field.setText("");
				nota3Field.setText("");
				promedioField.setText("");
				condicionField.setText("");
			}
		});
	}
}
