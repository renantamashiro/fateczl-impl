package core.exercise5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JSeparator;

public class Teste extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Teste() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(246, 173, 89, 21);
		add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnVencedor = new JTextPane();
		txtpnVencedor.setText("Vencedor");
		txtpnVencedor.setBounds(155, 173, 89, 21);
		add(txtpnVencedor);
		
		JTextPane txtpnPerdedor = new JTextPane();
		txtpnPerdedor.setText("Perdedor");
		txtpnPerdedor.setBounds(155, 206, 89, 21);
		add(txtpnPerdedor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(246, 206, 89, 21);
		add(textField_1);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(12, 263, 117, 25);
		add(btnCorrer);
		
		JLabel lblCarro = new JLabel("Carro 1");
		lblCarro.setForeground(Color.BLUE);
		lblCarro.setBounds(12, 53, 70, 15);
		add(lblCarro);
		
		JLabel lblCarro_2 = new JLabel("Carro 2");
		lblCarro_2.setForeground(Color.RED);
		lblCarro_2.setBounds(12, 106, 70, 15);
		add(lblCarro_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(12, 91, 426, 2);
		add(separator);

	}

}
