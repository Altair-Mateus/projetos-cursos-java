//	Developer: Altair Mateus T. Aelncastro
//	Last Update: 2020/04/09 | 09:21 PM

package ouvintes;

//Importações
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListenerSalvar implements ActionListener
{
	//	Aributos
	//	Text Field
	private JTextField cod;
	private JTextField nome;
	private JTextField precoCusto;
	private JTextField precoVenda;
	private JTextField lucro;
	private JTextField estoque;
	private JTextField ncm;
	private JTextField unMedida;
	private JTextField marca;
	private JTextField modelo;
	private JTextField origem;
	private JTextField icms;
	private JTextField codBarras;
	private JTextField situacao;
	private JTextField categoria;
	private JTextField infoAdicionais;
	
	//	Construtor
	public ListenerSalvar
		(
			JTextField cod, 
			JTextField nome,
			JTextField precoCusto,
			JTextField precoVenda,
			JTextField lucro,
			JTextField estoque,
			JTextField ncm,
			JTextField unMedida,
			JTextField marca,
			JTextField modelo,
			JTextField origem,
			JTextField icms,
			JTextField codBarras,
			JTextField situacao,
			JTextField categoria,
			JTextField infoAdicionais
				
		)
			{
				this.cod            = cod;
				this.nome           = nome;
				this.precoCusto     = precoCusto;
				this.precoVenda     = precoVenda;
				this.lucro          = lucro;
				this.estoque        = estoque;
				this.ncm            = ncm;
				this.unMedida       = unMedida;
				this.marca          = marca;
				this.modelo         = modelo;
				this.origem         = origem;
				this.icms           = icms;
				this.codBarras      = codBarras;
				this.situacao       = situacao;
				this.categoria      = categoria;
				this.infoAdicionais = infoAdicionais;
			}//	Fim do construtor ListenerSalvar

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String msg = "Código: " + cod.getText() + "\nNome: " + nome.getText() + "\nPreço de Custo: " + precoCusto.getText()
	    + "\nPreço de Venda: " + precoVenda.getText() + "\nLucro: " + lucro.getText() + "\nEstoque: " + estoque.getText()
		+ "\nNCM: " + ncm.getText() + "\nUnidade de Medida: " + unMedida.getText() + "\nMarca: " + marca.getText()
		+ "\nModelo: " + modelo.getText() + "\nOrigem: " + origem.getText() + "\nICMS: " + icms.getText() + "\nCódigo de Barras: "
		+ codBarras.getText() + "\nSituação: " + situacao.getText() + "\nCategoria: " + categoria.getText() 
		+ "\nInformações Adicionais: " + infoAdicionais.getText();
		
		JOptionPane.showMessageDialog(null,msg);
	}
}//	Fim da classe ListenerSalvar
