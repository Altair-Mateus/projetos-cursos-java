// Developer: Altair Mateus T Alencastro
// Last Update: 2020/01/30 | 12:05 PM

public class Veiculo 
{
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar()
	{
		System.out.println("BIBI");
	}//	Fim do método buzinar
	
	public void imprimirDados()
	{
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}// Fim do método imprimirDados

	
	// Início dos métodos getters e setters
	public String getMarca() 
	{
		return marca;
	}// Fim do getter getMarca

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}//	Fim do setter setMarca

	public String getModelo() 
	{
		return modelo;
	}// Fim do getter getModelo

	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}// Fim do setter setModelo

	public int getAno() 
	{
		return ano;
	}// Fim do getter getAno

	public void setAno(int ano) 
	{
		this.ano = ano;
	}// Fim do setter setAno
	
	
}//	Fim da classe Veículo
