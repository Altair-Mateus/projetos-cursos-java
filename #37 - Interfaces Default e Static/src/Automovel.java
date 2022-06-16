
public interface Automovel 
{
	
	void acelerar();
	void frear();
	
	default void derrapar()
	{
		acelerar();
		acelerar();
		frear();
	}//	Fim do m�todo default derrapar
	
	static int getVelocidadeMaxima()
	{
		return 300;
	}//	Fim do m�todo static getVelocidadeMaxima
	
}//	Fim da interface Automovel
