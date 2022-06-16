//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/24 | 11:00 PM

public class Retangulo 
{
	private double largura;
	private double altura;
	
	public Retangulo()
	{
		this(4, 3);
	}//	Fim do construtor Retangulo
	
	public Retangulo(double largura, double altura)
	{
		this.largura = largura;
		this.altura = altura;
	}//	Fim do construtor Retangulo com parâmetros
	
	public double calcularArea()
	{
		return largura * altura;
	}//	Fim do método calcularArea
}//	Fim da classe Retangulo
