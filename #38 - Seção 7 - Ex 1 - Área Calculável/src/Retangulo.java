
public class Retangulo implements AreaCalculavel
{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura)
	{
		this.altura = altura;
		this.base = base;
	}//	FIm do construtor Retangulo
	
	@Override
	public double calcularArea()
	{
		return base * altura;
	}//	FIm do método calcularArea
}//	FIm da classe Retangulo
