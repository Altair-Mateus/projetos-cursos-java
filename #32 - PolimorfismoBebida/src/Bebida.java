
public class Bebida
{
	private String nome;
	private boolean aquecer;
	
	public Bebida(String nome, boolean aquecer)
	{
		this.nome = nome;
		this.aquecer = aquecer;
		
	}//	Fim do Construtor com par�metros

	//	In�cio dos m�todos getters
	public String getNome() 
	{
		return nome;
	}//	Fim do getter getNome

	public boolean isAquecer() 
	{
		return aquecer;
	}//	Fim do getter isAquecer 
	//	Fim dos m�todos Getters
	
	public void preparar()
	{
		
	}//	Fim do m�todo preparar
	
}//	Fim da Classe Bebida
