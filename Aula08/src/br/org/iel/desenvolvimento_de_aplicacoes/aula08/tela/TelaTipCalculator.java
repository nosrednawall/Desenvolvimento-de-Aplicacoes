package br.org.iel.desenvolvimento_de_aplicacoes.aula08.tela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import br.org.iel.desenvolvimento_de_aplicacoes.aula08.controller.Logica;
import br.org.iel.desenvolvimento_de_aplicacoes.aula08.entity.Conta;

//inicia a classe tela extendendo de JFrame
public class TelaTipCalculator extends JFrame {

	/**
	 * 
	 */
//variáveis da classe
	private static final long serialVersionUID = 7091273272154901212L;
	private JPanel contentPane;
	private JTextField contaCliente;
	private JTextField totalGorjeta;
	private JTextField tottalConta;
	//texto que será colocado na label de porcentagem
	public static String valorPercentagemAlterandoAtodoEvento;

	/**
	 * Launch the application.
	 */
	
	//método main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTipCalculator frame = new TelaTipCalculator();
					frame.setVisible(true);
					frame.setTitle("TipCalculator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//médoto para criar a tela
	public TelaTipCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		//label da porcentagem
		JLabel porcentagem = new JLabel("15 %");
		//labels
		JLabel lblNewLabel_1 = new JLabel("Gorjeta");
		JLabel totalConta = new JLabel("Total");
		JLabel LabelConta = new JLabel("Valor da conta");
		
		//slider da porcentagem e valores minimo e maximo
		JSlider porcentagemGorjeta = new JSlider();
		porcentagemGorjeta.setValue(15);
		porcentagemGorjeta.setMaximum(30);

		//ouvinde ??? de tela, que no caso altera o valor da label
		porcentagemGorjeta.addChangeListener(new ChangeListener() {
			@SuppressWarnings("static-access")
			@Override
			public void stateChanged(ChangeEvent e) {
				valorPercentagemAlterandoAtodoEvento = new String().valueOf(porcentagemGorjeta.getValue());
				porcentagem.setText(valorPercentagemAlterandoAtodoEvento+" %");
			}
			
		});

		//jtext do total da gorjeta
		totalGorjeta = new JTextField();
		totalGorjeta.setEditable(false);
		totalGorjeta.setColumns(10);

		//jtext do total da conta
		tottalConta = new JTextField();
		tottalConta.setEditable(false);
		tottalConta.setColumns(10);
		
		//jtext do valor informado da sobre a conta do cliente sem gorjeta
		contaCliente = new JTextField();
		contaCliente.setColumns(10);
		
		//botão calcular e inicia o método para efetuar a lógica do programa
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {

				//instancia uma conta passando os valores da porcentagem e do valor da conta
				Conta conta = new Conta(Float.parseFloat(new String(contaCliente.getText())),
						porcentagemGorjeta.getValue());
				//efetua os calculos de gorjeta e a soma da conta com a gorjeta
				conta.setTotalGorjeta(new Logica().calculaGorjeta(conta));
				conta.setTotalConta(new Logica().calculaTotal(conta));

				//atualiza os campos com os valores desenvolvidos
				totalGorjeta.setText(new String().valueOf(conta.getTotalGorjeta()));
				tottalConta.setText(String.valueOf(conta.getTotalConta()));

			}
		});
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(LabelConta)
						.addComponent(totalConta)
						.addComponent(lblNewLabel_1)
						.addComponent(porcentagem))
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCalcular, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(tottalConta, Alignment.LEADING)
							.addComponent(porcentagemGorjeta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(totalGorjeta, Alignment.LEADING)
							.addComponent(contaCliente, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(contaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LabelConta))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(porcentagemGorjeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(porcentagem))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(totalGorjeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tottalConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(totalConta))
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(btnCalcular)
					.addGap(35))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
