// Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/06/16 | 1:40 PM

public class Fracao 
{
	double numerador1, denominador1;
	double numerador2, denominador2;
	
	public void multiplica_fracoes()
	{
		
		System.out.println();
		System.out.println("Resultado da Multiplicação entre Frações: ");
		System.out.printf("%f / ", (numerador1 / denominador1) * (numerador2 / denominador2));
	}// Fim do método multiplica_fracoes
	
	public Fracao()
	{
		
	}// Fim do construtor Fracao sem argumentos
	
	public Fracao(double numerador1, double denominador1, double numerador2, double denominador2)
	{
		this.numerador1 = numerador1;
		this.denominador1 = denominador1;
		this.numerador2 = numerador2;
		this.denominador2 = denominador2;
	}// Fim do construtor Fracao
}//	Fim da class Fracao
