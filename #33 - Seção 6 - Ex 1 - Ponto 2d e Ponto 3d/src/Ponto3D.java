//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/02/26 | 9:27 PM

public class Ponto3D extends Ponto2D
{
	private double coord_z;
	
	public Ponto3D(double coord_x, double coord_y, double coord_z)
	{
		//	Manda as coordenadas para o construtor Ponto2D
		super(coord_x, coord_y);
		
		this.coord_z = coord_z;
	}//	Fim do construtor Ponto 3D
	
	
	public double getCoord_z()
	{
		return coord_z;
	}//	Fim do getter getCoord_z

	
	@Override
	public String toString()
	{
		return super.toString() + ", Coordenada Z: " + coord_z;
	}//	Fim do método toString
	
}//	Fim da classe Ponto 3D
