//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/03/26 | 9:37 PM

public class Automovel extends Veiculo 
{
	@Override	
	public void ligar()
	{
		super.ligar();
		System.out.println("Automóvel Ligado");
	}//	Fim do método ligar() sobescrito
	
	@Override
	public void desligar()
	{
		super.desligar();
		System.out.println("Automóvel Desligado");
	}// Fim do método desligar sobescrito
}//	Fim da classe Automovel
