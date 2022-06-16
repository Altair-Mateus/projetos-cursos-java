//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/02/26 | 9:27 PM

public class Ponto2D 
{
	private double coord_x;
	private double coord_y;

	
	public Ponto2D(double coord_x, double coord_y)
	{
		this.coord_x = coord_x;
		this.coord_y = coord_y;
	}//	Fim do construtor Ponto2D
	
	
	//	Início dos métodos getters
	public double getCoord_x()
	{
		return coord_x;
	}//	Fim do getter getCoord_x
	
	public double getCoord_y()
	{
		return coord_y;
	}//	Fim do getter getCoord_y
	//	Fim dos métodos getters
	
	@Override
	public String toString()
	{
		return "Coordenada X: " + coord_x + ", Coordenada Y: " + coord_y;
	}//	Fim do método toString

}//	Fim da Classe Ponto2D
