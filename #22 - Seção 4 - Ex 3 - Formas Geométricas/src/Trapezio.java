//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/17 | 12:24 AM

public class Trapezio 
{
	double baseMaior;
	double baseMenor;
	double altura;
	
	public void calcularArea()
	{
		System.out.printf("Resultado: %f", ((baseMaior + baseMenor) / 2) * altura);
	}// Fim do método calcularArea
	
	public Trapezio()
	{
		
	}// Fim do construtor sem comandos
	
	public Trapezio(double baseMaior, double baseMenor, double altura)
	{
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		
	}// Fim do construtor Trapezio
}// Fim da Classe Trapezio
