package Atividade03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class TelaCalculapeso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7855837921311326699L;
	//declaração de variáveis
	private JPanel contentPane;
	private JTextField pesoInformado;
	private Float pesoTerra;
	private float resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculapeso frame = new TelaCalculapeso();
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
	@SuppressWarnings("unchecked")
	public TelaCalculapeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//criação do componentente jtextfield
		pesoInformado = new JTextField();
		pesoInformado.setColumns(10);
		
		//criação do combobox dos planetas, utilizando enum
		@SuppressWarnings("rawtypes")
		JComboBox planetas = new JComboBox();
		planetas.addItem("Selecione");
		planetas.addItem(Planeta.Júpiter);
		planetas.addItem(Planeta.Marte);
		planetas.addItem(Planeta.Mercúrio);
		planetas.addItem(Planeta.Saturno);
		planetas.addItem(Planeta.Urano);
		planetas.addItem(Planeta.Vênus);
		
		//criação do botão e do seu método de execução
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		       //verifica qual é o planeta informado e adiciona a variável planeta
				Planeta planeta = (Planeta) planetas.getSelectedItem();
		        
				//faz um switch do planeta escolhido e executa a lógica do mesmo
				switch (planeta) {
				case Júpiter:
					pesoTerra = Float.parseFloat(pesoInformado.getText());
					System.out.println(planeta);
					resultado = (float) ((pesoTerra / 10) * 2.64);
					JOptionPane.showMessageDialog(null, "Seu peso no planeta Júpiter será de: "+resultado);
					pesoInformado.setText("0");
					break;
					
				case Marte:
					pesoTerra = Float.parseFloat(pesoInformado.getText());
					System.out.println(planeta);
					resultado = (float) ((pesoTerra / 10) * 0.38);
					JOptionPane.showMessageDialog(null, "Seu peso no planeta Marte será de: "+resultado);
					pesoInformado.setText("0");
					break;
					
				case Mercúrio:
					pesoTerra = Float.parseFloat(pesoInformado.getText());
					System.out.println(planeta);
					resultado = (float) ((pesoTerra / 10) * 0.37);
					JOptionPane.showMessageDialog(null, "Seu peso no planeta Mercúrio será de: "+resultado);
					pesoInformado.setText("0");
					break;
					
				case Saturno:
					pesoTerra = Float.parseFloat(pesoInformado.getText());
					System.out.println(planeta);
					resultado = (float) ((pesoTerra / 10) * 1.15);
					JOptionPane.showMessageDialog(null, "Seu peso no planeta Saturno será de: "+resultado);
					pesoInformado.setText("0");
					break;
				
				case Urano:
					pesoTerra = Float.parseFloat(pesoInformado.getText());
					System.out.println(planeta);
					resultado = (float) ((pesoTerra / 10) * 1.17);
					JOptionPane.showMessageDialog(null, "Seu peso no planeta Urano será de: "+resultado);
					pesoInformado.setText("0");
					break;
					
				case Vênus :
					pesoTerra = Float.parseFloat(pesoInformado.getText());
					System.out.println(planeta);
					resultado = (float) ((pesoTerra / 10) * 0.88);
					JOptionPane.showMessageDialog(null, "Seu peso no planeta Vênus será de: "+resultado);
					pesoInformado.setText("0");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Selecione um planéta válido");
					pesoInformado.setText("0");
					break;
				}
			}
		});
		
		//posicionamento dos itens da tela
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(142)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnGravar)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(planetas, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(pesoInformado, Alignment.LEADING)))
					.addContainerGap(173, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(80)
					.addComponent(planetas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pesoInformado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnGravar)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
