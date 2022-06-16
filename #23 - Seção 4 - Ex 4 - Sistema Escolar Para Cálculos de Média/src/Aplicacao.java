//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/24 | 08:58 PM

public class Aplicacao 
{
	public static void main(String[] args) 
	{		
		Prova prova1A1 = new Prova(4.0, 2.5);
		Prova prova2A1 = new Prova(1.0, 7.0);
		Aluno aluno1 = new Aluno(prova1A1.calcularNotaTotal(), prova2A1.calcularNotaTotal());
		
		System.out.printf("Média Aluno 1: %f\n", aluno1.calcularMedia());
		
		Prova prova1A2 = new Prova(6.5, 3.5);
		Prova prova2A2 = new Prova(0.0, 3.0);
		Aluno aluno2 = new Aluno(prova1A2.calcularNotaTotal(), prova2A2.calcularNotaTotal());
		
		System.out.printf("Média Aluno 2: %f\n", aluno2.calcularMedia());
		
		Prova prova1A3 = new Prova(5.0, 4.0);
		Prova prova2A3 = new Prova(6.0, 1.5);
		Aluno aluno3 = new Aluno(prova1A3.calcularNotaTotal(), prova2A3.calcularNotaTotal());
		
		System.out.printf("Média Aluno 3: %f\n\n", aluno3.calcularMedia());
		
		Turma turma1 = new Turma(aluno1.calcularMedia(), aluno2.calcularMedia(), aluno3.calcularMedia());
		
		System.out.printf("Média da Turma: %f\n", turma1.calcularMedia());
			
	}//	Fim do método main
}//	Fim da classe Aplicacao
