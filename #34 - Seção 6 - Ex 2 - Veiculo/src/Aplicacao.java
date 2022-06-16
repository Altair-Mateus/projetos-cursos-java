//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/03/26 | 9:37 PM

public class Aplicacao 
{
	public static void main(String[] args)
	{
		
		// Automóvel
		Automovel auto = new Automovel();
		
		auto.ligar();
		System.out.println(auto.isLigado());
		
		auto.desligar();
		System.out.println(auto.isLigado() + "\n");
		//	Fim dos comandos do Automovel
		
		
		//	Motocicleta
		Motocicleta moto = new Motocicleta();
		
		moto.ligar();
		System.out.println(moto.isLigado());
		
		moto.desligar();
		System.out.println(moto.isLigado() + "\n");
		//	Fim dos comandos da Motocicleta
		
		
		//	Ônibus
		Onibus busao = new Onibus();
		
		busao.ligar();
		System.out.println(busao.isLigado());
		
		busao.desligar();
		System.out.println(busao.isLigado());
		//	Fim dos comandos do Ônibus
		
	}//	Fim do método main
	
}// Fim da classe Aplicacao
