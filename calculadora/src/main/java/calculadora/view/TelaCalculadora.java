package calculadora.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import calculadora.controller.CalculadoraController;
import calculadora.model.Operacoes;

public class TelaCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField primeiroValor;
	private JTextField segundoValor;
	private JComboBox<Operacoes> operacaoSelecionada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		primeiroValor = new JTextField();

		segundoValor = new JTextField();

		JLabel lblPrimeiroValor = new JLabel("Primeiro valor");

		JLabel lblSegundoValor = new JLabel("Segundo valor");

		operacaoSelecionada = new JComboBox<Operacoes>();
		operacaoSelecionada.addItem(Operacoes.DIVISAO);
		operacaoSelecionada.addItem(Operacoes.MULTIPLICACAO);
		operacaoSelecionada.addItem(Operacoes.RESTO);
		operacaoSelecionada.addItem(Operacoes.SOMA);
		operacaoSelecionada.addItem(Operacoes.SUBTRACAO);

		JLabel lblOperao = new JLabel("Operação");

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String operacao = operacaoSelecionada.getSelectedItem().toString();

				float valorUm = Float.parseFloat(primeiroValor.getText());
				float valorDois = Float.parseFloat(segundoValor.getText());
				
				JOptionPane.showMessageDialog(null, new CalculadoraController().calcula(valorUm, valorDois, operacao));
				
				primeiroValor.setText("0");
				segundoValor.setText("0");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap(33, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblPrimeiroValor)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(primeiroValor, GroupLayout.PREFERRED_SIZE, 99,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSegundoValor, GroupLayout.PREFERRED_SIZE, 116,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(27).addComponent(lblOperao)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(segundoValor, GroupLayout.PREFERRED_SIZE, 98,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnCalcular).addComponent(operacaoSelecionada,
														GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))))
				.addGap(170)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(63)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(primeiroValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPrimeiroValor))
						.addGap(37)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(segundoValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSegundoValor))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(operacaoSelecionada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOperao))
						.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE).addComponent(btnCalcular)
						.addGap(21)));
		contentPane.setLayout(gl_contentPane);

	}
}
