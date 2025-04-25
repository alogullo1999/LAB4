package Principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ejercicio1.V_Ejercicio1;
import Ejercicio2.V_Ejercicio2;
import Ejercicio3.V_Ejercicio3;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaPrincipal() {
		setTitle("TAREA4_GRUPO12_LAB4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V_Ejercicio1 ve1 = new V_Ejercicio1();
				ve1.setVisible(true);
			}
		});
		btnEjercicio1.setBounds(145, 71, 131, 59);
		contentPane.add(btnEjercicio1);

		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V_Ejercicio2 ve2 = new V_Ejercicio2();
				ve2.setVisible(true);
			}
		});
		btnEjercicio2.setBounds(145, 172, 131, 59);
		contentPane.add(btnEjercicio2);

		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V_Ejercicio3 ve3 = new V_Ejercicio3();
				ve3.setVisible(true);
			}
		});
		btnEjercicio3.setBounds(145, 269, 131, 59);
		contentPane.add(btnEjercicio3);
	}
}
