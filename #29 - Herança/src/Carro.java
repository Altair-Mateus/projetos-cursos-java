// Developer: Altair Mateus T Alencastro
// Last Update: 2020/01/30 | 12:05 PM

public class Carro extends Veiculo
{
	private boolean quatroPortas;
	
	@Override
	public void imprimirDados() 
	{
		super.imprimirDados();
		System.out.println("Quatro Portas: " + quatroPortas);
	}//	Fim do método imprimirDados
	
	//	Início dos métodos getters e setters
	public boolean isQuatroPortas() 
	{
		return quatroPortas;
	}//	Fim do getter isQuatroPortas

	public void setQuatroPortas(boolean quatroPortas) 
	{
		this.quatroPortas = quatroPortas;
	}//	Fim do setter setQuatroPortas
	
}//	Fim da classe Carro
