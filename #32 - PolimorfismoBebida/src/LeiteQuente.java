
public class LeiteQuente extends Bebida 
{
	public LeiteQuente()
	{
		super("Leite Quente", true);
	}//	Fim do construtor LeiteQuente
	
	@Override
	public void preparar() 
	{
		System.out.println("Pegando um copo");
		System.out.println("Colocando o leite no copo");
	}
}//	Fim da classe LeiteQuente
