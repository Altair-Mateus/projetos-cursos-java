//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/24 | 08:58 PM

public class Aluno 
{
	double prova1;
	double prova2;
	
	public double calcularMedia()
	{
		return (prova1 + prova2) / 2;
	}//	Fim do método calcularMedia
	
	public Aluno()
	{
		
	}// Fim do construtor sem comandos
	
	public Aluno(double prova1, double prova2)
	{
		this.prova1 = prova1;
		this.prova2 = prova2;
	}// Fim do construtor Aluno
}// Fim da classe Aluno
