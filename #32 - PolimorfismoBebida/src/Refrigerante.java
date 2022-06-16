
public class Refrigerante extends Bebida 
{
	public Refrigerante()
	{
		super("Refrigerante", false);
	}//	Fim do construtor Refrigerante
	
	@Override
	public void preparar() 
	{
		System.out.println("Pegando um copo");
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o Refrigerante");
	}//	Fim do método preparar
	
}//	FIm da classe Refrigerante
