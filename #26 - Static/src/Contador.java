
public class Contador 
{
	private static int valor;
	
	static
	{
		valor = 1;
	}//	Fim do bloco Static
	
	public static void incrementar()
	{
		valor++;
	}//	Fim do método incrementar
	
	public static int getValor()
	{
		return valor;
	}//	Fim do getter getValor()
}//	Fim da classe Contador
