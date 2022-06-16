//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/10/01 - 02:14 PM

public class Lampada 
{
	private boolean ligada;

	/*	Construtor para definir o estado inicial da
	l�mpada como ligada */
	public Lampada(boolean ligada)
	{
		this.ligada = ligada;
	}//	Fim do construtor Lampada
	
	public void ligar()
	{
		ligada = true;
	}//	Fim do m�todo ligar
	
	public void desligar()
	{
		ligada = false;
	}//	Fim do m�todo desligar	
	
	public void imprimir()
	{
		if(ligada == true)
		{
			System.out.println("L�mpada Ligada \n");
		} else
		{
			System.out.println("L�mpada Desligada \n");
		}//	Fim do bloco if-else
			
	}//	Fim do m�todo imprimir
	
}//	Fim da classe Lampada
