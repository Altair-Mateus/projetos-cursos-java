//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/03/26 | 9:37 PM

public class Onibus extends Veiculo 
{
	
	@Override
	public void ligar()
	{
		super.ligar();
		System.out.println("�nibus Ligado");
	}//	Fim do m�todo ligar() sobrescrito
	
	@Override
	public void desligar()
	{
		super.desligar();
		System.out.println("�nibus Desligado");
	}
}//	Fim da classe Onibus
