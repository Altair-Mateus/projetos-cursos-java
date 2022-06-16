//	Developer: Altair Mateus T. Aelncastro
//	Last Update: 2020/04/08 | 10:59 PM

package telas;

//Importações
import javax.swing.*;
import java.awt.*;


public class TelaProduto extends JFrame
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
	private JButton bt_novo;
	private JButton bt_pesquisar;
	private JButton bt_salvar;
	private JButton bt_deletar;
	//	Fim dos Elementos da tela
	//	Fim dos atributos
	
	//	Construtor
	public TelaProduto()
	{
		//	Inicia a Janela
		this.initialize();
		
		//	Renderizando de maneira normal a Janela
		this.setExtendedState(NORMAL);
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
		this.setBounds(300, 100, 800, 500);
		
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
		label_infoAdicionais = new JLabel(" Informações Adicionais: ");
		
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
		bt_novo = new JButton("Novo");
		bt_pesquisar = new JButton("Pesquisar");
		bt_salvar = new JButton("Salvar");
		bt_deletar = new JButton("Deletar");
		
		
		
		//	Configurando e Adicionando no painel
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
		panel.add(bt_novo);
		panel.add(bt_pesquisar);
		panel.add(bt_salvar);
		panel.add(bt_deletar);
		
		/*	Adicionao o painel ao JFrame (própria classe), fazendo que o container
		 * panel faça parte da janela.
		 */
		this.add(panel);
		
		//	Tamanho default da Janela
		this.setPreferredSize(new Dimension(800, 500));
		
		//	Título da Janela
		this.setTitle("Cadastro de Produtos");
		
		this.pack();
		
		//	Exibe
		this.setVisible(true);
		
		//	Quando fexhar a tela o programa se encerra
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//	Fim do método initialize
	
	//	Início do método main
	public static void main(String[] args)
	{
		TelaProduto product = new TelaProduto();
	}//	FIm do método main

}//	Fim da Classe TelaProduto
