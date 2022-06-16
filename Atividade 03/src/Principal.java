//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/04/06 | 11:32 PM

//	Importando biblioteca Swing do Java
import javax.swing.JOptionPane;


public class Principal 
{
	public static void main(String[] args)
	{
		//	Variável Auxiliar
		String aux;
		
		
		//	Criando o objeto
		Produto product = new Produto();
		
		// Início da Leitura dos Dados
		
		// Nome 
		product.setNome(JOptionPane.showInputDialog("Digite o nome do Produto: "));
		
		//	Código
		aux = JOptionPane.showInputDialog("Qual será o Código do Produto? ");
		product.setCod(Integer.parseInt(aux));
		
		//	Preço de Custo
		aux = JOptionPane.showInputDialog("Informe o Preço de Custo do Produto:");
		product.setPrecoCusto(Double.parseDouble(aux));
		
		//	Preço de Venda
		aux = JOptionPane.showInputDialog("Informe o Preço de Venda do Produto:");
		product.setPrecoVenda(Double.parseDouble(aux));
		
		//	NCM
		aux = JOptionPane.showInputDialog("Informe o NCM do produto: ");
		product.setNcm(Integer.parseInt(aux));
		
		//	Unidade de Medida
		// Criando as opções
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
		//	Criando as Opções
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
		
		//	Código de Barras
		product.setCodBarras(JOptionPane.showInputDialog("Informe o Código de Barras do Produto: "));
		
		// Categoria
		product.setCategoria(JOptionPane.showInputDialog("Informe a Categoria do Produto: "));
		
		//	Situação
		//	Criando as opções
		Object[] situacao = {"ATIVO", "INATIVO"};
		aux = (String) JOptionPane.showInputDialog
		(
			null,
			"Informe a Situação do Produto:",
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
		
		//	Informações Adicionais
		product.setInfoAdicionais(JOptionPane.showInputDialog("Informações Adicionais do Produto: "));
		
	}//	Fim do método main
}//	Fim da classe Principal
