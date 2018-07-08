package br.iel.desenvolvimento.aplicacoes.prova.view;

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

import br.iel.desenvolvimento.aplicacoes.prova.controller.CalculaPeso;
import br.iel.desenvolvimento.aplicacoes.prova.entity.Planetas;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pesoInformado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		pesoInformado = new JTextField();
		pesoInformado.setColumns(10);
		
		JLabel lblInformeOPeso = new JLabel("Informe o peso");
		
		JComboBox<Planetas> planetaSelecionado = new JComboBox<Planetas>();
		planetaSelecionado.addItem(Planetas.Júpiter);
		planetaSelecionado.addItem(Planetas.Marte);
		planetaSelecionado.addItem(Planetas.Mercúrio);
		planetaSelecionado.addItem(Planetas.Saturno);
		planetaSelecionado.addItem(Planetas.Urano);
		planetaSelecionado.addItem(Planetas.Vênus);
		
		JLabel lblSelecioneUmPlaneta = new JLabel("Selecione um planeta");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Float peso = Float.parseFloat(pesoInformado.getText());
				Planetas planeta = (Planetas) planetaSelecionado.getSelectedItem();
				
				float resultado = new CalculaPeso().calcular(peso, planeta);
				
				JOptionPane.showMessageDialog(null, "O peso será de: "+resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(55)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblInformeOPeso)
								.addComponent(lblSelecioneUmPlaneta))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(planetaSelecionado, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoInformado, Alignment.LEADING)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(150)
							.addComponent(btnCalcular)))
					.addContainerGap(96, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(pesoInformado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addComponent(lblInformeOPeso)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(planetaSelecionado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSelecioneUmPlaneta))
					.addGap(69)
					.addComponent(btnCalcular)
					.addContainerGap(78, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
