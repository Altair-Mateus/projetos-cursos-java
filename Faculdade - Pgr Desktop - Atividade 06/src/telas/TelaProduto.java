//	Developer: Altair Mateus T. Aelncastro
//	Last Update: 2020/04/13 | 10:53 PM

package telas;

//Importações
import javax.swing.*;
import java.awt.*;
import ouvintes.ListenerSalvar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ouvintes.ListenerSalvar;

public class TelaProduto extends JDialog
{
	//	Início dos Atributos
	//	Tem a função de atuar como container para os elementos que estiverem na janela
	private JPanel panel;
	
	//	Elementos da Tela
	//	Label
	private JLabel label_cod;
	private JLabel label_nome;
	private JLabel label_precoCusto;
	private JLabel label_precoVenda;
	private JLabel label_lucro;
	private JLabel label_estoque;
	private JLabel label_ncm;
	private JLabel label_unMedida;
	private JLabel label_marca;
	private JLabel label_modelo;
	private JLabel label_origem;
	private JLabel label_icms;
	private JLabel label_codBarras;
	private JLabel label_situacao;
	private JLabel label_categoria;
	private JLabel label_infoAdicionais;
	
	//	Text Field
	private JTextField text_cod;
	private JTextField text_nome;
	private JTextField text_precoCusto;
	private JTextField text_precoVenda;
	private JTextField text_lucro;
	private JTextField text_estoque;
	private JTextField text_ncm;
	private JTextField text_unMedida;
	private JTextField text_marca;
	private JTextField text_modelo;
	private JTextField text_origem;
	private JTextField text_icms;
	private JTextField text_codBarras;
	private JTextField text_situacao;
	private JTextField text_categoria;
	private JTextField text_infoAdicionais;
	
	//	Buttons
	private JButton bt_cancelar;
	private JButton bt_salvar;
	//	Fim dos Elementos da tela
	//	Fim dos atributos
	
	//	Construtor
	public TelaProduto()
	{
		//	Inicia a Janela
		this.initialize();
		
		this.setModal(true);
		this.setVisible(true);
	}//	Fim do Construtor TelaProduto
	
	//	Método para inicializar a Janela
	public void initialize()
	{
		//	Criando um novo objeto
		panel = new JPanel();
		
		//	Grid Layout
		GridLayout g1 = new GridLayout(9, 2, 10, 10);
		
		//	Configura o Layout do painel
		panel.setLayout(g1);
		
		//	Configura o tamanho da posição da Janela
		this.setBounds(0, 0, 600, 300);
		
		//	Inicialização
		//	Label
		label_cod            = new JLabel(" Código: ");
		label_nome           = new JLabel(" Nome: ");
		label_precoCusto     = new JLabel(" Preço de Custo: ");
		label_precoVenda     = new JLabel(" Preço de Venda: ");
		label_lucro          = new JLabel(" Lucro: ");
		label_estoque        = new JLabel(" Estoque: ");
		label_ncm            = new JLabel(" NCM: ");
		label_unMedida       = new JLabel(" Un de Medida: ");
		label_marca          = new JLabel(" Marca: ");
		label_modelo         = new JLabel(" Modelo: ");
		label_origem         = new JLabel(" Origem: ");
		label_icms           = new JLabel(" ICMS: ");
		label_codBarras      = new JLabel(" Código de Barras: ");
		label_situacao       = new JLabel(" Situação: ");
		label_categoria      = new JLabel(" Categoria: ");
		label_infoAdicionais = new JLabel(" Info Adicionais: ");
		
		//	Text Field
		text_cod 		     = new JTextField();
		text_nome 		     = new JTextField();
		text_precoCusto	     = new JTextField();
		text_precoVenda      = new JTextField();
		text_lucro 		     = new JTextField();
		text_estoque	     = new JTextField();
		text_ncm		     = new JTextField();
		text_unMedida	     = new JTextField();
		text_marca 		     = new JTextField();
		text_modelo		     = new JTextField();
		text_origem		     = new JTextField();
		text_icms	         = new JTextField();
		text_codBarras	     = new JTextField();
		text_situacao	     = new JTextField();
		text_categoria	     = new JTextField();
		text_infoAdicionais  = new JTextField();
		
		//	Button
		bt_cancelar  = new JButton("Cancelar");
		bt_salvar    = new JButton("Salvar");
		
		//	Evento de CLique
		//	Botão Salvar
		bt_salvar.addActionListener(new ListenerSalvar
				(
					text_cod, 
					text_nome, 
					text_precoCusto, 
					text_precoVenda, 
					text_lucro, 
					text_estoque, 
					text_ncm, 
					text_unMedida, 
					text_marca, 
					text_modelo, 
					text_origem, 
					text_icms, 
					text_codBarras, 
					text_situacao, 
					text_categoria, 
					text_infoAdicionais
				)
			); //	Fim do Botão Salvar
		
		bt_cancelar.addActionListener((ActionListener) new ActionListener()
			
				{
						public void actionPerformed(ActionEvent e)
						{
							setVisible (false);
							dispose ();					
						}
				}	
			);//	Fim do Botão Cancelar
		
		
		//	Adicionando no painel
		//	Código
		panel.add(label_cod);
		panel.add(text_cod);
		
		//	Nome
		panel.add(label_nome);
		panel.add(text_nome);
		
		//	Preço de Custo
		panel.add(label_precoCusto);
		panel.add(text_precoCusto);
		
		//	Preço de Venda
		panel.add(label_precoVenda);
		panel.add(text_precoVenda);
		
		//	Lucro
		panel.add(label_lucro);
		panel.add(text_lucro);
		
		//	Estoque
		panel.add(label_estoque);
		panel.add(text_estoque);
		
		//	NCM
		panel.add(label_ncm);
		panel.add(text_ncm);
		
		//	Unidade de Medida
		panel.add(label_unMedida);
		panel.add(text_unMedida);
		
		//	Marca
		panel.add(label_marca); 
		panel.add(text_marca);
		
		//	Modelo
		panel.add(label_modelo);
		panel.add(text_modelo);
		
		//	Origem
		panel.add(label_origem);
		panel.add(text_origem);
		
		//	ICMS
		panel.add(label_icms);
		panel.add(text_icms);
		
		//	Código de Barras
		panel.add(label_codBarras);
		panel.add(text_codBarras);
		
		//	Situação
		panel.add(label_situacao);
		panel.add(text_situacao);
		
		//	Categoria
		panel.add(label_categoria);
		panel.add(text_categoria);
		
		//	Informações Adicionais
		panel.add(label_infoAdicionais);
		panel.add(text_infoAdicionais);
		
		//	Botões
		panel.add(new Label());// adicionar um componente vazio
		panel.add(bt_salvar);
		panel.add(bt_cancelar);
		
		/*	Adiciona o painel ao JFrame (própria classe), fazendo que o container
		 * panel faça parte da janela.
		 */
		this.add(panel);
		
		//	Tamanho default da Janela
		this.setPreferredSize(new Dimension(600, 300));
		
		//	Título da Janela
		this.setTitle("Cadastro de Produtos");
		
		this.pack();
		
		this.setLocationRelativeTo(null);
		
		//	Quando fexhar a tela o programa se encerra
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}//	Fim do método initialize
	
	//	Início do método main
	public static void main(String[] args)
	{
		TelaListagem c = new TelaListagem();
	}//	FIm do método main

}//	Fim da Classe TelaProduto
