package Exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaExercicio01 extends JFrame {

	private JPanel contentPane;
	private JTextField qtdaContas;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGeradorDeContas = new JLabel("Gerador de contas");
		lblGeradorDeContas.setBounds(136, 12, 153, 15);
		contentPane.add(lblGeradorDeContas);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnGerar.setBounds(157, 127, 117, 25);
		contentPane.add(btnGerar);
		
		qtdaContas = new JTextField();
		qtdaContas.setBounds(157, 98, 114, 19);
		contentPane.add(qtdaContas);
		qtdaContas.setColumns(10);
		
		JLabel lblInformeAQuantidade = new JLabel("Informe a quantidade de contas a serem geradas");
		lblInformeAQuantidade.setBounds(30, 49, 388, 33);
		contentPane.add(lblInformeAQuantidade);
	}
}
