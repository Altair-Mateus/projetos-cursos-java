//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/24 | 08:58 PM

public class Turma 
{
	double aluno1;
	double aluno2;
	double aluno3;
	
	public double calcularMedia()
	{
		return (aluno1 + aluno2 + aluno3) / 3;
	}
	
	public Turma()
	{
		
	}//	Fim do construtor sem comandos
	
	public Turma(double aluno1, double aluno2, double aluno3)
	{
		this.aluno1 = aluno1;
		this.aluno2 = aluno2;
		this.aluno3 = aluno3;
	}
}//	Fim da Classe Turma
