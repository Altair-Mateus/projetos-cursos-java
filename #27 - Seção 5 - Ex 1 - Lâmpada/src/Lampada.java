//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/10/01 - 02:14 PM

public class Lampada 
{
	private boolean ligada;

	/*	Construtor para definir o estado inicial da
	lâmpada como ligada */
	public Lampada(boolean ligada)
	{
		this.ligada = ligada;
	}//	Fim do construtor Lampada
	
	public void ligar()
	{
		ligada = true;
	}//	Fim do método ligar
	
	public void desligar()
	{
		ligada = false;
	}//	Fim do método desligar	
	
	public void imprimir()
	{
		if(ligada == true)
		{
			System.out.println("Lâmpada Ligada \n");
		} else
		{
			System.out.println("Lâmpada Desligada \n");
		}//	Fim do bloco if-else
			
	}//	Fim do método imprimir
	
}//	Fim da classe Lampada
