
public class Bebida
{
	private String nome;
	private boolean aquecer;
	
	public Bebida(String nome, boolean aquecer)
	{
		this.nome = nome;
		this.aquecer = aquecer;
		
	}//	Fim do Construtor com parâmetros

	//	Início dos métodos getters
	public String getNome() 
	{
		return nome;
	}//	Fim do getter getNome

	public boolean isAquecer() 
	{
		return aquecer;
	}//	Fim do getter isAquecer 
	//	Fim dos métodos Getters
	
	public void preparar()
	{
		
	}//	Fim do método preparar
	
}//	Fim da Classe Bebida
