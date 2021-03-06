package Main;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class View_profile implements ActionListener {

	public static String nome;
	public JFrame frmViewProfile;
	private JPanel contentPane;
	private JTextField fldNome;
	private JTextField fldSenha;
	private JTextField fldContato;
	private JTextField fldEmail;
	private Button btnVoltar,btnSair;
	
	public View_profile() {
		initialize();
	}

	private void initialize() {
		/* Inicializa��o dos componentes */
		//Criando os componentes
		frmViewProfile = new JFrame();
		contentPane = new JPanel();
		JLabel lblPerfil = new JLabel("Perfil");
		JLabel lblNome = new JLabel("Nome");
		JLabel lblSenha = new JLabel("Senha");
		JLabel lblContato = new JLabel("Contato");
		JLabel lblEmail = new JLabel("E-mail");
		fldNome = new JTextField();
		fldSenha = new JTextField();
		fldContato = new JTextField();
		fldEmail = new JTextField();
		btnVoltar = new Button("Voltar");
		btnSair = new Button("Sair");
		
		
		/* Configura��o dos componentes */
		//Configurando o frame
		frmViewProfile.setTitle("Perfil");
		frmViewProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmViewProfile.setBounds(100, 100, 360, 302);
		frmViewProfile.setContentPane(contentPane);
		frmViewProfile.setResizable(false);
		
		//Configurando o contentPane		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		//Configurando o label perfil
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblPerfil.setBounds(152, 11, 109, 44);		

		//Configurando o label nome
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(10, 72, 49, 31);

		//Configurando o label senha
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(10, 114, 80, 20);

		//Configurando o label contato
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContato.setBounds(10, 145, 88, 20);

		//Configurando o label email
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(10, 183, 83, 14);

		//Configurando o textField nome
		fldNome.setBounds(101, 79, 200, 20);
		fldNome.setEditable(false);		
		fldNome.setColumns(10);	

		//Configurando o textField senha
		fldSenha.setBounds(101, 110, 200, 20);
		fldSenha.setEditable(false);		
		fldSenha.setColumns(10);

		//Configurando o textField contato
		fldContato.setBounds(101, 141, 200, 20);
		fldContato.setEditable(false);		
		fldContato.setColumns(10);		

		//Configurando o textField  email
		fldEmail.setBounds(101, 182, 200, 20);
		fldEmail.setEditable(false);		
		fldEmail.setColumns(10);
		
		//Configurando o bot�o voltar
		btnVoltar.addActionListener(this);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoltar.setBounds(61, 228, 89, 23);

		//Configurando o bot�o sair
		btnSair.addActionListener(this);
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBounds(172, 229, 89, 23);
		
		/* Adicionando os componentes do contentPane */

		contentPane.add(lblPerfil);
		contentPane.add(lblNome);		
		contentPane.add(lblSenha);
		contentPane.add(lblContato);
		contentPane.add(lblEmail);
		contentPane.add(fldNome);
		contentPane.add(fldSenha);
		contentPane.add(fldContato);
		contentPane.add(fldEmail);
		contentPane.add(btnVoltar);
		contentPane.add(btnSair);
		
		try
		{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_oo?user=root&password=");
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery("select nome, senha, contato, email from perfil where nome='"+nome+"'");
			if(rs.next())
			{
				fldNome.setText(rs.getString(1));
				fldSenha.setText(rs.getString(2));
				fldContato.setText(rs.getString(3));
				fldEmail.setText(rs.getString(4));

			}
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Dados n�o encontrados.");
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Button bb=(Button)ae.getSource();
		if(bb==btnVoltar)
		{
			frmViewProfile.dispose();
			Login_welcome m = new Login_welcome();
			m.frmLoginWelcome.setVisible(true);
		}
		if(bb==btnSair)
		{
			System.exit(0);
		}
				
	}
	
}
