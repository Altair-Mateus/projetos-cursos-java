
public interface Automovel 
{
	
	void acelerar();
	void frear();
	
	default void derrapar()
	{
		acelerar();
		acelerar();
		frear();
	}//	Fim do método default derrapar
	
	static int getVelocidadeMaxima()
	{
		return 300;
	}//	Fim do método static getVelocidadeMaxima
	
}//	Fim da interface Automovel
