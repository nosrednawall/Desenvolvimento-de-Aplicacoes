package Atividade02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Atividade02 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4699159725917486543L;

	// declaração de variaveis
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	// contador inicia com 0
	static private Integer contador = 0;
	// pega o número aleatório
	private static int numero = randInt(0, 100);

	// método que retorna o numero aleatorio, de 0 a 100
	public static int randInt(int min, int max) {
		java.util.Random rand = new java.util.Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade02 frame = new Atividade02();
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
	public Atividade02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblAdivinheONmero = new JLabel("Adivinhe o número");

		textField = new JTextField();
		textField.setColumns(10);
		// cria o botão e a lógica dele
		JButton btnAdvinhe = new JButton("Advinhe");
		btnAdvinhe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// contador
				contador++;
				// apenas para não ficar no escuro
				System.out.println(numero);
				// parse
				Integer numeroInformado = Integer.parseInt(textField.getText());

				// inicio da lógica
				if (numeroInformado > 0) {
					if (numeroInformado < 100) {
						if (numeroInformado == numero) {
							JOptionPane.showMessageDialog(null, "Acertou");
						} else {
							if (((numeroInformado + 5) < numero) || ((numeroInformado - 5) < numero)) {
								JOptionPane.showMessageDialog(null, "Tá muito quente");
							} else if (((numeroInformado + 10) < numero) && ((numeroInformado - 10) < numero)) {
								JOptionPane.showMessageDialog(null, "Tá quente");
							} else if (((numeroInformado + 20) < numero) && ((numeroInformado - 20) < numero)) {
								JOptionPane.showMessageDialog(null, "Esfriando");
							} else {
								JOptionPane.showMessageDialog(null, "Congelado");
							}
						}
						// mensagens de controle
					} else {
						JOptionPane.showMessageDialog(null, "Informe um número menor que 100");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Informe um número maior que 0");
				}
				// zera as variaveis informadas pelo usuário
				textField_1.setText(contador.toString());
				textField.setText("");
				numeroInformado = 0;
			}
		});
		// criação do campo do cntador
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		// posicionamento dos itens da tela
		JLabel lblTentativas = new JLabel("Tentativas");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addGap(134)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblAdivinheONmero)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnAdvinhe)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(textField_1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(28).addComponent(lblTentativas)))
				.addContainerGap(167, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblAdivinheONmero).addGap(50)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(42).addComponent(btnAdvinhe)
						.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE).addComponent(lblTentativas)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(textField_1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
}
