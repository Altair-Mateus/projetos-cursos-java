
public class Ferrari implements Carro, ItemCaro
{

	@Override
	public void virarEsquerda() 
	{
		System.out.println("Ferrari virou � Esquerda");
	}//	Fim do m�todo virarEsquerda()

	@Override
	public void virarDireita()
	{
		System.out.println("Ferrari virou � Direita");
	}//	Fim do m�todo virarDireita

	@Override
	public void acelerar() 
	{
		System.out.println("Ferrari acelerou");
	}//	Fim do m�todo acelerar

	@Override
	public void abrirPorta() 
	{
		System.out.println("Ferrari abriu a Porta ");
	}//	Fim do m�todo abrirPorta

	@Override
	public double getPreco() 
	{

		return 1000000;
	}//	Fim do m�todo getPreco
	
}//	Fim da classe Ferrari
