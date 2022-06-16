package telas;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.DAOFuncionarios;
import models.Funcionario;

public class TelaListagem extends JFrame
{
	private JPanel  panel;
	private JPanel  panel_botoes;
	private JButton bt_novo;
	private JButton bt_deletar;
	private JButton bt_sair;
	private JLabel  label_title;
	
	//itens do menu    
	private JMenuBar  b_menu;    
	private JMenu     menu_programa;    
	private JMenuItem item_cadastro;    
	private JMenuItem item_sair;
        
        //  Atributos da Listagem
        private JList<Funcionario> lista;
        private JScrollPane scroll_lista;
        private DAOFuncionarios dao;
	
	//inicialização    
	public void initialize()
	{
		//botões        
		bt_novo    = new JButton("Novo");        
		bt_deletar = new JButton("Apagar");       
		bt_sair    = new JButton("Sair");
		
		//título        
		label_title = new JLabel("Listagem de Funcionários");
		
		//painéis        
		panel        = new JPanel();        
		panel_botoes = new JPanel();
		b_menu        = new JMenuBar();
		menu_programa = new JMenu("Programa");
		item_cadastro = new  JMenuItem("Cadastrar Funcionário");
		item_sair     = new JMenuItem("Sair");
		
		//configuração do menu
		
		//configura o item do menu
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
		
		//configura o item do menu
		item_cadastro.addActionListener(new ActionListener()
		{      
			@Override
			public void actionPerformed(ActionEvent e)
			{            
				TelaCadastro c = new TelaCadastro();
			}
		}
		);
		
		//adicao dos itens do menu
		menu_programa.add(item_cadastro);
		menu_programa.addSeparator();
		menu_programa.add(item_sair);
		b_menu.add(menu_programa);
		
		this.setJMenuBar(b_menu);   //seta o menu
		
		//layout do painel total
        panel.setLayout(new BorderLayout(5, 5));
        
        //tamanho da janela
        this.setBounds(0, 0, 600, 300);
        this.setPreferredSize(new    Dimension(600,300));
        
        // configuracao da listagem
        //configura o painel
        lista = new JList<>();
        lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lista.setLayoutOrientation(JList.VERTICAL);
        lista.setModel(dao.list()); 
        lista.setVisibleRowCount(-1);
        
        scroll_lista =new JScrollPane(lista);
        panel.add(scroll_lista,BorderLayout.CENTER);
        
        //adicao de elementos
        panel.add(label_title,   BorderLayout.PAGE_START);
        
        
        //	Subpainel de bot�es
        panel_botoes.setLayout(new GridLayout(6, 1, 10, 10));
        
        //configura os botoes                
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
        
    	bt_novo.addActionListener(new ActionListener()
			{            
				@Override           
				public void actionPerformed(ActionEvent e)
				{                                
					TelaCadastro  c  = new TelaCadastro();
				}
			}
    	);
        
        //adiciona        
        panel_botoes.add(bt_novo);        
        panel_botoes.add(bt_deletar);        
        panel_botoes.add(bt_sair);
        
        //coloca o subpainel no painel-mae        
        panel.add(panel_botoes, BorderLayout.LINE_END);
        
        
        // adiciona o panel no Frame
        this.add(panel);
        this.pack();
        
        //define o título da janela
        this.setTitle("Cadastro  de  Funcionários");
        
        
        //exibe
        this.setVisible(true);
        
        this.setLocationRelativeTo(null);
        
        //define que quando fechar a janela, o programa acaba
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
	}//	Fim do m�todo initialize
	
	//	Construtor
	public TelaListagem()
	{
                this.dao = DAOFuncionarios.getInstance();
		this.initialize();
		this.setExtendedState(NORMAL);
		
	}//	Fim do Construtor
	
	
	
}//	Fim da classe TelaListagem
