
public class Circunferencia implements AreaCalculavel
{
	private double pi = 3.14;
	private double diametro;
	
	public Circunferencia(double diametro)
	{
		this.diametro = diametro;
	}
	
	@Override
	public double calcularArea()
	{
		return pi * diametro;
	}
}//	Fim da classe Circunferencia
