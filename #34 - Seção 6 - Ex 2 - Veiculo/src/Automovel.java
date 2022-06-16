//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/03/26 | 9:37 PM

public class Automovel extends Veiculo 
{
	@Override	
	public void ligar()
	{
		super.ligar();
		System.out.println("Autom�vel Ligado");
	}//	Fim do m�todo ligar() sobescrito
	
	@Override
	public void desligar()
	{
		super.desligar();
		System.out.println("Autom�vel Desligado");
	}// Fim do m�todo desligar sobescrito
}//	Fim da classe Automovel
