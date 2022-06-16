//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/04/06 | 11:32 PM

//	Importando biblioteca Swing do Java
import javax.swing.JOptionPane;


public class Principal 
{
	public static void main(String[] args)
	{
		//	Vari�vel Auxiliar
		String aux;
		
		
		//	Criando o objeto
		Produto product = new Produto();
		
		// In�cio da Leitura dos Dados
		
		// Nome 
		product.setNome(JOptionPane.showInputDialog("Digite o nome do Produto: "));
		
		//	C�digo
		aux = JOptionPane.showInputDialog("Qual ser� o C�digo do Produto? ");
		product.setCod(Integer.parseInt(aux));
		
		//	Pre�o de Custo
		aux = JOptionPane.showInputDialog("Informe o Pre�o de Custo do Produto:");
		product.setPrecoCusto(Double.parseDouble(aux));
		
		//	Pre�o de Venda
		aux = JOptionPane.showInputDialog("Informe o Pre�o de Venda do Produto:");
		product.setPrecoVenda(Double.parseDouble(aux));
		
		//	NCM
		aux = JOptionPane.showInputDialog("Informe o NCM do produto: ");
		product.setNcm(Integer.parseInt(aux));
		
		//	Unidade de Medida
		// Criando as op��es
		Object[] tipos_un = {"Unidade", "Metro", "Kg"};
		product.setUnMedida((String) JOptionPane.showInputDialog
			(
				null, 
				"Selecione a Un de Medida:", 
				"Por Favor",
				JOptionPane.WARNING_MESSAGE,
                null,
                tipos_un, 
			    "Unidade" 
			)
		);

		//	Marca
		product.setMarca(JOptionPane.showInputDialog("Informe a Marca do Produto: "));
		
		//	Modelo
		product.setModelo(JOptionPane.showInputDialog("Informe o Modelo do Produto: "));
		
		//	Origem
		//	Criando as Op��es
		Object[] origem = {"Nacional", "Internacional"};
		product.setOrigem((String) JOptionPane.showInputDialog
			(
				null,
				"Selecione a Origem do Produto: ",
				"Por Favor",
				JOptionPane.WARNING_MESSAGE,
				null,
				origem,
				"Nacional"
			)
		);
		
		//	C�digo de Barras
		product.setCodBarras(JOptionPane.showInputDialog("Informe o C�digo de Barras do Produto: "));
		
		// Categoria
		product.setCategoria(JOptionPane.showInputDialog("Informe a Categoria do Produto: "));
		
		//	Situa��o
		//	Criando as op��es
		Object[] situacao = {"ATIVO", "INATIVO"};
		aux = (String) JOptionPane.showInputDialog
		(
			null,
			"Informe a Situa��o do Produto:",
			"Por Favor",
			JOptionPane.WARNING_MESSAGE,
			null,
			situacao,
			"ATIVO"
		);
		
		//	Validando resposta e enviando para o objeto
		if(aux == "ATIVO")
		{
			product.setSituacao(true);
		} else
			{
				product.setSituacao(false);
			}
		
		// Estoque
		aux = JOptionPane.showInputDialog("Informe o Estoque do Produto:");
		product.setEstoque(Integer.parseInt(aux));
		
		//	Informa��es Adicionais
		product.setInfoAdicionais(JOptionPane.showInputDialog("Informa��es Adicionais do Produto: "));
		
	}//	Fim do m�todo main
}//	Fim da classe Principal
