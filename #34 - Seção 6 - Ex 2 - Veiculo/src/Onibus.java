//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/03/26 | 9:37 PM

public class Onibus extends Veiculo 
{
	
	@Override
	public void ligar()
	{
		super.ligar();
		System.out.println("Ônibus Ligado");
	}//	Fim do método ligar() sobrescrito
	
	@Override
	public void desligar()
	{
		super.desligar();
		System.out.println("Ônibus Desligado");
	}
}//	Fim da classe Onibus
