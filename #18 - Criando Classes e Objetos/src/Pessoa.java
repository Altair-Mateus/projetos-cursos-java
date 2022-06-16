
public class Pessoa 
{
	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas)
	{
		// Somando com as figurinhas já possuídas
		this.numFigurinhas += numFigurinhas;
		
	}//	Fim do método receber()
	
	void dar(int numFigurinhas, Pessoa p)
	{
		// Subtraindo o número de figurinhas
		this.numFigurinhas -= numFigurinhas;
		
		// Passando as figurinhas para outra pessoa
		p.receber(numFigurinhas);
		
	}//	Fim do método dar()
} // Fim da classe Pessoa
