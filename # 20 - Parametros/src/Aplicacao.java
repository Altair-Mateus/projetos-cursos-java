
public class Aplicacao 
{
	public static void main(String[] args) 
	{
		// Criando objetos
		Operacao o = new Operacao();
		
		int x = 10;
		
		o.trocar(x);
		
		System.out.println(x);
		
		
		Valor valor = new Valor();
		
		valor.v = 10;
		
		o.alterarValor(valor);
		System.out.println(valor.v);
	}// Fim do m�todo main
}// Fim da Classe Aplicacao
