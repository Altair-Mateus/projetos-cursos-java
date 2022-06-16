//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/17 | 12:24 AM

public class Circunferencia 
{
	double raio;
	
	public void calcularArea()
	{
		System.out.printf("Resultado: %f", 3.1416 * (Math.pow(raio, 2)));
	}// Fim do método calcularArea()
	
	public Circunferencia()
	{
		
	}// Fim do construtor sem comandos
	
	public Circunferencia(double raio)
	{
		this.raio = raio;
	}// Fim do construtor Circunferencia
}// Fim da classe Circunferencia
