package Exercicio02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;
	private JTextField valor3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio2 frame = new TelaExercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaExercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformeNumeros = new JLabel("Informe 3 numeros");
		lblInformeNumeros.setBounds(124, 12, 184, 15);
		contentPane.add(lblInformeNumeros);
		
		JLabel label = new JLabel("1");
		label.setBounds(64, 47, 62, 15);
		contentPane.add(label);
		
		valor1 = new JTextField();
		valor1.setBounds(12, 63, 114, 19);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(191, 47, 70, 15);
		contentPane.add(label_1);
		
		valor2 = new JTextField();
		valor2.setBounds(147, 63, 114, 19);
		contentPane.add(valor2);
		valor2.setColumns(10);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(331, 47, 70, 15);
		contentPane.add(label_2);
		
		valor3 = new JTextField();
		valor3.setBounds(287, 63, 114, 19);
		contentPane.add(valor3);
		valor3.setColumns(10);
		
		JButton btnNewButton = new JButton("Executar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(valor1.getText());
				double num2 = Double.parseDouble(valor2.getText());
				double num3 = Double.parseDouble(valor3.getText());
				
				double resultado = num1 * num2 * num3;
				
				JOptionPane.showMessageDialog(null,"O valor da multiplicacao e: "+ resultado);
			}
		});
		btnNewButton.setBounds(147, 120, 117, 25);
		contentPane.add(btnNewButton);
	}
}
