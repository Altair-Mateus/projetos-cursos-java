//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/10/01 - 02:14 PM

public class Aplicacao 
{
	public static void main(String[] args)
	{
		// Cria uma l�mpada e inicia ela como ligada
		Lampada lamp = new Lampada(true);
		
		//	Imprime o estado da l�mpada
		lamp.imprimir();
		
		//	Desliga a L�mpada
		lamp.desligar();
		
		//	Imprime o estado da l�mpada
		lamp.imprimir();
		
	}// Fim do m�todo main
}//	Fim da classe Aplicacao
