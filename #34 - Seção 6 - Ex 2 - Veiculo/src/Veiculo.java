//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/03/26 | 9:37 PM

public class Veiculo 
{
	private boolean ligado;
	
	public void ligar()
	{
		ligado = true;
	}//	Fim do m�todo ligar()
	
	public void desligar() 
	{
		ligado = false;
	}//	Fim do m�todo desligar()
	
	public boolean isLigado()
	{
		return ligado;
	}
}//	Fim da classe Veiculo
