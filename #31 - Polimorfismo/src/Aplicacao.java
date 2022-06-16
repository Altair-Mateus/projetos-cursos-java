//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2020/02/05 | 10:45 AM

public class Aplicacao 
{
	public static void main(String[] args) 
	{
		/*Animal a = new Cachorro();
		
		if (a instanceof Cachorro)
		{
			Cachorro c = (Cachorro) a;
			c.morder();
		}//	Fim da verifica��o*/
		
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		falar(c);
		falar(g);
		
	}//	Fim do m�todo main
	
	/*Com este m�todo, futuramente podemos implentar
	 * muitos outros animais e mesmo assim ele ir� 
	 * funcionar, sendo o ganho em sistemas complexos
	 * definitivamente alto*/
	private static void falar(Animal a)
	{
		a.falar();
	}//	Fim 
	
}//	Fim da classe Aplicacao
