package Exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio01 extends JFrame {

	private JPanel contentPane;
	private JTextField numero1;
	private JTextField numero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExercicio01 frame = new TelaExercicio01();
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
	public TelaExercicio01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{144, 154, 0, 0};
		gbl_contentPane.rowHeights = new int[]{15, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblIn = new JLabel("Informe dois numeros");
		GridBagConstraints gbc_lblIn = new GridBagConstraints();
		gbc_lblIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblIn.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblIn.gridx = 1;
		gbc_lblIn.gridy = 0;
		contentPane.add(lblIn, gbc_lblIn);
		
		JLabel lblNumero = new JLabel("Numero1");
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero.gridx = 0;
		gbc_lblNumero.gridy = 2;
		contentPane.add(lblNumero, gbc_lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero2");
		GridBagConstraints gbc_lblNumero_1 = new GridBagConstraints();
		gbc_lblNumero_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNumero_1.gridx = 2;
		gbc_lblNumero_1.gridy = 2;
		contentPane.add(lblNumero_1, gbc_lblNumero_1);
		
		numero1 = new JTextField();
		GridBagConstraints gbc_numero1 = new GridBagConstraints();
		gbc_numero1.insets = new Insets(0, 0, 5, 5);
		gbc_numero1.fill = GridBagConstraints.HORIZONTAL;
		gbc_numero1.gridx = 0;
		gbc_numero1.gridy = 3;
		contentPane.add(numero1, gbc_numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		GridBagConstraints gbc_numero2 = new GridBagConstraints();
		gbc_numero2.insets = new Insets(0, 0, 5, 0);
		gbc_numero2.fill = GridBagConstraints.HORIZONTAL;
		gbc_numero2.gridx = 2;
		gbc_numero2.gridy = 3;
		contentPane.add(numero2, gbc_numero2);
		numero2.setColumns(10);
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(numero1.getText());
				double num2 = Double.parseDouble(numero2.getText());
				
				double resultado = num1 - num2;
				
				JOptionPane.showMessageDialog(null,"O resultado e: "+resultado);
			}
		});
		GridBagConstraints gbc_btnExecutar = new GridBagConstraints();
		gbc_btnExecutar.insets = new Insets(0, 0, 0, 5);
		gbc_btnExecutar.gridx = 1;
		gbc_btnExecutar.gridy = 5;
		contentPane.add(btnExecutar, gbc_btnExecutar);
	}

}
