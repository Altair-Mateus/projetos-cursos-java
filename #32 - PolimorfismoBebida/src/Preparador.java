
public class Preparador 
{
	public void prepararBebida(Bebida bebida)
	{
		System.out.println("Preparando a bebida " + bebida.getNome());
		
		bebida.preparar();
		
		if(bebida.isAquecer())
		{
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}//	Fim do if
		
		System.out.println("Bebida preparada com sucesso!");
	}//	Fim do método prepararBebida
}//	Fim da classe Preparador
