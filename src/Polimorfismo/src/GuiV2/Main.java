package GuiV2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main implements ActionListener{

	JFrame frmAplicaoJava = new JFrame("Tela para saque");
	JPanel panel = new JPanel();
	JLabel lblValor = new JLabel("Digite o valor que deseja sacar:");
	JTextField fldValor = new JTextField();
	JButton btnEnviar = new JButton("Enviar");
	JTextArea txtArea = new JTextArea();
	private Conta conta;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conta conta = new Conta("12345-6", 100.00);
					Main window = new Main(conta);
					window.frmAplicaoJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main(Conta conta) {
		this.conta = conta;
		initialize();
	}

	private void initialize() {	
		//Configuração dos componentes
		frmAplicaoJava.setBounds(100, 100, 450, 300);
		frmAplicaoJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		fldValor.setColumns(10);
		txtArea.setText(conta.toString() + "\n");
		
		//Adiconando os componentes no panel Frame
		frmAplicaoJava.getContentPane().add(panel, BorderLayout.NORTH);
		frmAplicaoJava.getContentPane().add(txtArea, BorderLayout.CENTER);
		
		//Adicionando os componentes no painel panel
		panel.add(lblValor);				
		panel.add(fldValor);
		panel.add(btnEnviar);
		
		btnEnviar.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(!fldValor.getText().isEmpty()) {
			conta.saque(Double.parseDouble(fldValor.getText()));
			JOptionPane.showMessageDialog(frmAplicaoJava,  conta.toString(), 
					"Aviso", JOptionPane.INFORMATION_MESSAGE);
			txtArea.setText(txtArea.getText() + conta.toString() + "\n");
		}else
			JOptionPane.showMessageDialog(frmAplicaoJava, "Insira um valor.", 
					"Alerta", JOptionPane.WARNING_MESSAGE);
	}

}
