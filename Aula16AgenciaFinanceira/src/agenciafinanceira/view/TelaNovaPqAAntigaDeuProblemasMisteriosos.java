package agenciafinanceira.view;

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
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import agenciafinanceira.controller.CalculoCambio;
import agenciafinanceira.entity.Cotacao;
import agenciafinanceira.entity.MoedaCotadaEnum;

public class TelaNovaPqAAntigaDeuProblemasMisteriosos {

	private JFrame frame;
	private JTextField valorCotacao;
	private JTextField qtdaDias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovaPqAAntigaDeuProblemasMisteriosos window = new TelaNovaPqAAntigaDeuProblemasMisteriosos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaNovaPqAAntigaDeuProblemasMisteriosos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		valorCotacao = new JTextField();
		valorCotacao.setColumns(10);

		qtdaDias = new JTextField();
		qtdaDias.setColumns(10);

		JComboBox<MoedaCotadaEnum> moedaEscolhida = new JComboBox<MoedaCotadaEnum>();
		moedaEscolhida.addItem(MoedaCotadaEnum.BOLIVARIANO);
		moedaEscolhida.addItem(MoedaCotadaEnum.DOLAR_CANADENSE);
		moedaEscolhida.addItem(MoedaCotadaEnum.DOLAR_EUA);
		moedaEscolhida.addItem(MoedaCotadaEnum.EURO);
		moedaEscolhida.addItem(MoedaCotadaEnum.GUARANIS);
		moedaEscolhida.addItem(MoedaCotadaEnum.LIBRA_ESTERLINA);
		moedaEscolhida.addItem(MoedaCotadaEnum.PESO_ARGENTINO);
		moedaEscolhida.addItem(MoedaCotadaEnum.PESO_MEXICANO);
		moedaEscolhida.addItem(MoedaCotadaEnum.PESO_USUGUAIO);

		JLabel lblValorAComprar = new JLabel("Valor a comprar");

		JLabel lblQuandidadesDeDias = new JLabel("Quandidades de dias");

		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double valorInformadoDouble = Double.parseDouble(valorCotacao.getText());
				Integer qtdaDiasInteger = Integer.parseInt(qtdaDias.getText());

				Cotacao cotacao = new Cotacao();
				cotacao.setValorInformado(valorInformadoDouble);
				cotacao.setQtdaDias(qtdaDiasInteger);
				cotacao.setMoedaCotada(MoedaCotadaEnum.valueOf(moedaEscolhida.getSelectedItem().toString()));

				JOptionPane.showMessageDialog(null, "O valor será de: " + new CalculoCambio().calculaCambio(cotacao),
						"Resultado", JOptionPane.INFORMATION_MESSAGE);
				valorCotacao.setText("");
				qtdaDias.setText("");
			}

		});

		JLabel lblMoeda = new JLabel("moeda");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(159).addComponent(calcular))
						.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup().addGap(52).addComponent(lblValorAComprar)
										.addGap(27))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblMoeda).addComponent(lblQuandidadesDeDias))
										.addGap(49)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(qtdaDias).addComponent(valorCotacao)
										.addComponent(moedaEscolhida, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addContainerGap(185, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(valorCotacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblValorAComprar))
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(qtdaDias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuandidadesDeDias))
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(moedaEscolhida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMoeda))
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE).addComponent(calcular)
						.addGap(20)));
		frame.getContentPane().setLayout(groupLayout);
	}
}
