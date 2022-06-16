package telas;


//	Importações
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import ouvintes.ListenerSalvar;

public class TelaCadastro extends JDialog
{
	//	Atributos
	//	Tem a fun��o de atuar como container para os elementos que estiverem na janela
	private JPanel panel;
	
	//elementos da tela    
	private JLabel label_cpf;    
	private JLabel label_rg;    
	private JLabel label_nome;    
	private JLabel label_cargo;    
	private JTextField text_cpf;    
	private JTextField text_rg;    
	private JTextField text_nome;    
	private JTextField text_cargo;    
	private JButton bt_ok;    
	private JButton bt_cancela;
	
	//	Construtor
	public TelaCadastro()
	{
		//	Executa a Inicialização da Janela
		this.initialize();
		
		this.setModal(true);
		this.setVisible(true);
		
	}//	Fim do construtor TelaCadastro
	
	//	M�todo para inicializar a Janela
	public void initialize()
	{
		//	Cria o novo objeto para o JPanel
		panel = new JPanel();
		
		//	Grid Layout com 5 linhas e 2 colunas
		GridLayout g1 = new GridLayout(5, 2, 10, 10);
		
		//	Configura oLayout do Painel
		panel.setLayout(g1);
		
		//	Configura o tamanho da posi��o da Janela
		this.setBounds(0, 0, 400, 200);
		
		//	Inicializa��o
		label_cpf   = new JLabel("CPF");
		label_rg    = new JLabel("RG: ");
		label_nome  = new JLabel("Nome: ");
		label_cargo = new JLabel("Cargo: ");
		
		text_cpf   = new JTextField();
		text_rg    = new JTextField();
		text_nome  = new JTextField();
		text_cargo = new JTextField();
		
		bt_ok 	   = new JButton("OK");
		bt_cancela = new JButton("Cancelar");
		
		//	Configuração
		// evento de clique
		bt_ok.addActionListener(new ListenerSalvar(this, text_nome, text_rg, text_cpf, text_cargo));
		
		bt_cancela.addActionListener((ActionListener) new ActionListener()
			{       
				public void actionPerformed(ActionEvent e)
					{            
						setVisible(false);            
						dispose();            
					}
			}
		);
				
		//	Adicionando ao Painel
		panel.add(label_nome);
		panel.add(text_nome);
		panel.add(label_cpf);
		panel.add(text_cpf);
		panel.add(label_rg);
		panel.add(text_rg);
		panel.add(label_cargo);
		panel.add(text_cargo);
		panel.add(bt_ok);
		panel.add(bt_cancela);
		
		/*	Adiciona o Panel no Frame
		Adiciona  o  painel  ao  JFrame  (pr�pria  classe),  fazendo  que o container
		panel fa�a parte da janela.
		*/
		this.add(panel);
		
		/*	Define o tamanho default da Janela
		 Define o tamanho preferencial para a janela. Ele só aceita objetos da classe Dimension como argumento
		 */
		this.setPreferredSize(new Dimension(400, 200));
		
		//	Define o t�tulo da Janela
		this.setTitle("Cadastro de Funcion�rios");
		
		//	Esse  comando  faz  a  compactação  da  janela,  deixando  pronta para o uso.
		this.pack();
		
		this.setLocationRelativeTo(null);
		
		//	Define que quando fechar a tela o programa acaba
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}//	Fim do m�todo initialize

	//	M�todo Main
	public static void main(String[] args) 
	{
		TelaListagem c = new TelaListagem();
	}
}//	Fim da classe TelaCadastro
