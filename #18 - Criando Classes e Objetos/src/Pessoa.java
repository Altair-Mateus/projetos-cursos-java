
public class Pessoa 
{
	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas)
	{
		// Somando com as figurinhas j� possu�das
		this.numFigurinhas += numFigurinhas;
		
	}//	Fim do m�todo receber()
	
	void dar(int numFigurinhas, Pessoa p)
	{
		// Subtraindo o n�mero de figurinhas
		this.numFigurinhas -= numFigurinhas;
		
		// Passando as figurinhas para outra pessoa
		p.receber(numFigurinhas);
		
	}//	Fim do m�todo dar()
} // Fim da classe Pessoa
