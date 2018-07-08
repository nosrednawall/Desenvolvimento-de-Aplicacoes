package Atividade04;

//declarações de eventos
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//declarações do swing
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;


/*
 * Atividade 04 APS 03*/

public class TelaJanken extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int jogadaComputador;
	private int jogadaPessoa;

	//método define vencedor, recebe a jogada da pessoa e do computador como argumento
	public static void defineVencedor(int jogadaComputador, int jogadaPessoa) {
		
		//faz um switch pela jogada da pessoa, poderia ser do computador também
		switch (jogadaPessoa) {
		case 1:
			//primeiro caso pessoa escolhe papel
			if( (jogadaComputador > 1)&&(jogadaPessoa == 1) ) {
				JOptionPane.showMessageDialog(null, "Você escolheu Papel e o computador Tesoura - Computador venceu");
				break;
			}else if((jogadaComputador < 1)&&(jogadaPessoa == 1)) {
				JOptionPane.showMessageDialog(null, "Você escolheu Papel e o computador Pedra - Você venceu");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Você escolheu Papel e o computador Papel - Deu empate");
			}
			break;
		
		case 2:
			//segundo caso pessoa escolhe tesoura
			if( (jogadaComputador == 0)&&(jogadaPessoa == 2) ) {
				JOptionPane.showMessageDialog(null, "Você escolheu Tesoura e o computador Pedra - Computador venceu");
				break;
			}else if((jogadaComputador == 1)&&(jogadaPessoa == 2)) {
				JOptionPane.showMessageDialog(null, "Você escolheu Tesoura e o computador Papel - Você venceu");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Você escolheu Tesoura e o computador Tesoura - Deu empate");
			}
			break;
		
		case 0:
			//terceiro caso pessoa escolhe pedra
			if( (jogadaComputador == 1)&&(jogadaPessoa == 0) ) {
				JOptionPane.showMessageDialog(null, "Você escolheu Pedra e o computador Papel - Computador venceu");
				break;
			}else if((jogadaComputador == 2)&&(jogadaPessoa == 0)) {
				JOptionPane.showMessageDialog(null, "Você escolheu Pedra e o computador Tesoura - Você venceu");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Você escolheu Pedra e o computador Pedra - Deu empate");
			}
			break;
			
		default:
			break;
		}
	}
	
	//método fornecido pelo professor para gerar os números aleatórios da jogada do computador
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
					TelaJanken frame = new TelaJanken();
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
	public TelaJanken() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		//label superior, Janken é Jóquenpo em japones, coloquei pq fica menor
		JLabel lblJanken = new JLabel("Janken");

		//inicio da declaração dos botões Jradio
		JRadioButton rdbtnPedra = new JRadioButton("Pedra");

		JRadioButton rdbtnPapel = new JRadioButton("Papel");

		JRadioButton rdbtnTesoura = new JRadioButton("Tesoura");

		//Criação do conjunto de botões
		ButtonGroup conjunto = new ButtonGroup();
		conjunto.add(rdbtnPedra);
		conjunto.add(rdbtnPapel);
		conjunto.add(rdbtnTesoura);
		JLabel lblSuaJogada = new JLabel("Sua jogada");

		//criação do botão e do método que executa a ação do botão
		JButton btnVerificarGanhador = new JButton("Verificar ganhador");
		btnVerificarGanhador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cria a jogada do computador
				jogadaComputador = randInt(0, 2);

				//atribui uma joga a pessoa, com base na seleção dela
				if (rdbtnPedra.isSelected()) {
					jogadaPessoa = 0;
				}else if(rdbtnPapel.isSelected()) {
					jogadaPessoa = 1;
				}else if(rdbtnTesoura.isSelected()) {
					jogadaPessoa = 2;
				}else {
					JOptionPane.showMessageDialog(null, "Selecione uma das três jogadas");
				}
				//chama o método define e limpa a seleção
				defineVencedor(jogadaComputador, jogadaPessoa);
				conjunto.clearSelection();
			}
		});

		//posiciona os itens da tela, é gerado pelo windowbuilder
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(178).addComponent(lblJanken))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(102).addComponent(btnVerificarGanhador))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(27).addComponent(lblSuaJogada)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(rdbtnPapel)
										.addComponent(rdbtnPedra).addComponent(rdbtnTesoura))))
				.addContainerGap(164, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblJanken).addGap(67)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblSuaJogada)
								.addComponent(rdbtnPedra))
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnPapel)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnTesoura)
						.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
						.addComponent(btnVerificarGanhador).addGap(25)));
		contentPane.setLayout(gl_contentPane);
	}
}
