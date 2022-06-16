//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/03/26 | 9:37 PM

public class Motocicleta extends Veiculo 
{
	@Override
	public void ligar()
	{
		super.ligar();
		System.out.println("Motocicleta Ligada");
	}//	Fim do m�todo ligar() sobrescrito
	
	@Override
	public void desligar()
	{
		super.desligar();
		System.out.println("Motocicleta Desligada");
	}//	Fim do m�todo desligar() sobrescrito
}//	Fim da classe Motocicleta
