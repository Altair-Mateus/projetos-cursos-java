//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/17 | 12:24 AM

public class Triangulo 
{
	double base;
	double altura;
	
	public void calcularArea()
	{
		
		System.out.printf("Resultado: %f", (base * altura) / 2); 
		
	}// Fim do método calcularArea
	
	public Triangulo()
	{
		
	}// Fim do construtor Triangulo sem comandos
	
	public Triangulo(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}// Fim do Construtor Triangulo
	
}//	Fim da classe Triangulo
