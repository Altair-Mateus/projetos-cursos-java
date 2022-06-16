//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/24 | 08:58 PM
	
public class Prova 
{
	double notaParte1;
	double notaParte2;
	
	public double calcularNotaTotal()
	{
		return notaParte1 + notaParte2;
	}// Fim do método calcularNotaTotal
	
	public Prova()
	{
		
	}//	Fim do construtor sem comandos
	
	public Prova(double notaParte1, double notaParte2)
	{
		this.notaParte1 = notaParte1;
		this.notaParte2 = notaParte2;
		
		if(notaParte1 > 10)
		{
			System.out.println("Nota Inválida! \n Encerrando o programa...");
			System.exit(0);
		}
	}// Fim do construtor Prova
}//	Fim da classe Prova
