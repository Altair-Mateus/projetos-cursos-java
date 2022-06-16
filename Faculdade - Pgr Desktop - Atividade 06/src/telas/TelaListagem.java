//	Developer: Altair Mateus T. Aelncastro
//	Last Update: 2020/04/13 | 10:53 PM

package telas;

//	Importações
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaListagem extends JFrame
{
	//	Atributos
	private JPanel panel;
	private JPanel panel_botoes;
	private JButton bt_novo;
	private JButton bt_deletar;
	private JButton bt_sair;
	private JButton bt_pesquisar;
	private JLabel  label_title;
	
	//	Itens do Menu
	private JMenuBar b_menu;
	private JMenu menu_programa;
	private JMenuItem item_cadastro;
	private JMenuItem item_sair;
	
	//	Inicialização
	public void initialize()
	{
		//	Botões
		bt_novo      = new JButton("Novo");
		bt_deletar   = new JButton("Deletar");
		bt_sair      = new JButton("Sair");
		bt_pesquisar = new JButton("Pesquisar");
		
		//	Título
		label_title = new JLabel("Listagem de Produtos");
		
		//	Painéis
		panel         = new JPanel();
		panel_botoes  = new JPanel();
		b_menu        = new JMenuBar();
		menu_programa = new JMenu("Programa");
		item_cadastro = new JMenuItem("Cadastrar Produto");
		item_sair     = new JMenuItem("Sair");
		
		//	Configuração do Menu
		//	Configura o item Sair no Menu
		item_sair.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				dispose();
				System.exit(0);
			}
		}
		);
		
		//	Configura o item Cadastro no Menu
		item_cadastro.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					TelaProduto c = new TelaProduto();
				}
			}
		);
		
		//	Adição dos Itens do Menu
		menu_programa.add(item_cadastro);
		menu_programa.addSeparator();
		menu_programa.add(item_sair);
		b_menu.add(menu_programa);
		
		//	Seta o menu
		this.setJMenuBar(b_menu);
		
		//	Layout total do painel
		panel.setLayout(new BorderLayout(5, 5));
		
		//	Tamanho da Janela
		this.setBounds(0, 0, 800, 400);
		this.setPreferredSize(new Dimension(800, 400));
		
		//	Adição de Elementos
		panel.add(label_title, BorderLayout.PAGE_START);
		
		//	Subpainel de botões
		panel_botoes.setLayout(new GridLayout(6, 1, 10, 10));
		
		//	Configura os botões
		//	Botão Sair
		bt_sair.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					setVisible(false);
					dispose();
					System.exit(0);
				}
			}
		);
		
		//	Botão Novo
		bt_novo.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					TelaProduto c = new TelaProduto();
				}
			}
		);
		
		
		//	Adiciona
		panel_botoes.add(bt_novo);
		panel_botoes.add(bt_deletar);
		panel_botoes.add(bt_sair);
		panel_botoes.add(bt_pesquisar);
		
		//	Coloca o Subpainel no painel Mãe
		panel.add(panel_botoes, BorderLayout.LINE_END);
		
		//	Adiciona o painel no Frame
		this.add(panel);
		this.pack();
		
		//	Define p título da Janela
		this.setTitle("Cadastro de Produtos");
		
		//	Exibe
		this.setVisible(true);
		
		this.setLocationRelativeTo(null);
		
		//	Define que quando fechar a janela o programa acaba
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//	Fim do método initialize
	
	//	Construtor
	public TelaListagem()
	{
		this.initialize();
		this.setExtendedState(NORMAL);
	}//	Fim do contrutor TelaListagem

}//	Fim da classe TelaListagem
