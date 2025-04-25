package Ejercicio3;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class V_Ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final JButton btnAceptar = new JButton("Aceptar");

	/**
	 * Create the frame.
	 */
	public V_Ejercicio3() {
		setTitle("Ejercicio 3");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 347);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLocation(17, 10);
		panel.setPreferredSize(new Dimension(400, 35));
		panel.setSize(new Dimension(400, 35));
		panel.setForeground(Color.BLACK);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Elige un sistema operativo");
		panel.add(lblNewLabel);

		JRadioButton rdbtnWin = new JRadioButton("Windows");
		panel.add(rdbtnWin);

		JRadioButton rdbtnMac = new JRadioButton("Mac");
		panel.add(rdbtnMac);

		JRadioButton rdbtnLin = new JRadioButton("Linux");
		panel.add(rdbtnLin);
	
		ButtonGroup grupoRadios = new ButtonGroup();
        grupoRadios.add(rdbtnWin);
        grupoRadios.add(rdbtnMac);
        grupoRadios.add(rdbtnLin);
		
	
		JPanel panel_2 = new JPanel();
		panel_2.setSize(new Dimension(400, 35));
		panel_2.setPreferredSize(new Dimension(400, 35));
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		panel_2.setBounds(17, 75, 400, 112);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JCheckBox chckbxProg = new JCheckBox("Programación");
		chckbxProg.setBounds(225, 18, 118, 23);
		panel_2.add(chckbxProg);

		JCheckBox chckbxADM = new JCheckBox("Administración");
		chckbxADM.setBounds(225, 44, 118, 23);
		panel_2.add(chckbxADM);

		JCheckBox chckbxDGraf = new JCheckBox("Diseño Grafico");
		chckbxDGraf.setBounds(225, 70, 118, 23);
		panel_2.add(chckbxDGraf);

		JLabel lblElijaUnaEpecialidad = new JLabel("Elija una Especialidad");
		lblElijaUnaEpecialidad.setBounds(34, 44, 156, 26);
		panel_2.add(lblElijaUnaEpecialidad);

		JLabel lblCantidadDeHs = new JLabel("Cantidad de horas en el Computador");
		lblCantidadDeHs.setBounds(27, 208, 221, 26);
		contentPane.add(lblCantidadDeHs);

		textField = new JTextField();
		textField.setBounds(295, 211, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c) && c != '\b') {
		            e.consume(); // NO ACEPTA NINGÚN CARACTER QUE NO SEAN NÚMEROS
		        }
		    }
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sistema = "";
				    if (rdbtnWin.isSelected()) sistema = "Windows";
			        else if (rdbtnMac.isSelected()) sistema = "Mac";
			        else if (rdbtnLin.isSelected()) sistema = "Linux";
				    
				    //validacion sistema
				    if (sistema.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Por favor, seleccione un sistema operativo.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }
				    
				    
			        String especialidad = "";
			        if (chckbxProg.isSelected()) especialidad += "Programación";
			        if (chckbxADM.isSelected()) {
			            if (!especialidad.isEmpty()) especialidad += " - ";
			            especialidad += "Administración";
			        }
			        if (chckbxDGraf.isSelected()) {
			            if (!especialidad.isEmpty()) especialidad += " - ";
			            especialidad += "Diseño Gráfico";
			        }
			        //validacion especialidad
			        if (especialidad.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Por favor, seleccione al menos una especialidad.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }
			        String horas = textField.getText().trim();
			        
			        //validacion horas
			        if (horas.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Por favor, ingrese la cantidad de horas.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }
			        String mensaje = sistema + " - " + especialidad + " - " + horas + " hs";
			        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnAceptar.setBounds(297, 266, 120, 31);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		btnSalir.setBounds(17, 266, 120, 31);
		contentPane.add(btnSalir);
	}
}
