//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/10/01 - 02:14 PM

public class Aplicacao 
{
	public static void main(String[] args)
	{
		// Cria uma lâmpada e inicia ela como ligada
		Lampada lamp = new Lampada(true);
		
		//	Imprime o estado da lâmpada
		lamp.imprimir();
		
		//	Desliga a Lâmpada
		lamp.desligar();
		
		//	Imprime o estado da lâmpada
		lamp.imprimir();
		
	}// Fim do método main
}//	Fim da classe Aplicacao
