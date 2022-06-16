
public class Ferrari implements Carro, ItemCaro
{

	@Override
	public void virarEsquerda() 
	{
		System.out.println("Ferrari virou à Esquerda");
	}//	Fim do método virarEsquerda()

	@Override
	public void virarDireita()
	{
		System.out.println("Ferrari virou à Direita");
	}//	Fim do método virarDireita

	@Override
	public void acelerar() 
	{
		System.out.println("Ferrari acelerou");
	}//	Fim do método acelerar

	@Override
	public void abrirPorta() 
	{
		System.out.println("Ferrari abriu a Porta ");
	}//	Fim do método abrirPorta

	@Override
	public double getPreco() 
	{

		return 1000000;
	}//	Fim do método getPreco
	
}//	Fim da classe Ferrari
