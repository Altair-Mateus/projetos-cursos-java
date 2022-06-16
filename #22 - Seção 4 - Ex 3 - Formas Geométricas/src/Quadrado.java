//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/17 | 12:24 AM

public class Quadrado 
{
	double lado;
	
	public void calcularArea()
	{
		System.out.printf("Resultado: %f", Math.pow(lado, 2));
	}// Fim do método calcularArea()
	
	public Quadrado()
	{
		
	}// Fim do construtor sem comandos
	
	public Quadrado(double lado)
	{
		this.lado = lado;
	}// Fim do construtor Quadrado
}// Fim da classe Quadrado
