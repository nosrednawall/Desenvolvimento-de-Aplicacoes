import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTextField arquivotxt;
	JButton binarioButton;
	JButton xmlButton;
	JButton jsonButton; // json.org pagina web

	public static void main(String[] args) {
		System.out.println("ola mundo");
	}

	public Tela() {// Construtor.
		this.setSize(300, 300);

		this.getContentPane().setLayout(new GridLayout(4, 1));

		arquivotxt = new JTextField();
		this.getContentPane().add(arquivotxt);

		binarioButton = new JButton("Binario");
		this.getContentPane().add(binarioButton);

		binarioButton.addActionListener(new ActionListener() { // adda ctr barra espa�o / new a ctr barra espa�o

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("--" + arquivotxt.getText());
				Arquivo.gravarBinario(arquivotxt.getText());
				JOptionPane.showMessageDialog(null, arquivotxt.getText() + " gerado");
			}
		});

		// ----------------------------------------------------------------------------------------------------------------------/

		xmlButton = new JButton("XML");

		this.getContentPane().setLayout(new GridLayout(4, 1));

		arquivotxt = new JTextField("     ");

		this.getContentPane().add(xmlButton);

		xmlButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Arquivo.gravarXml(arquivotxt.getText());
				JOptionPane.showMessageDialog(null, "oi 2");
			}
		});

		// -----------------------------------------------------------------------------------------------------------------//

		jsonButton = new JButton("JSON");
		this.getContentPane().add(jsonButton);

		jsonButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "oi 3");
			}
		});

		this.setVisible(true);
	}
}