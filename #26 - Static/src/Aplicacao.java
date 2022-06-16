
public class Aplicacao 
{
	public static void main(String[] args) 
	{
		
		int soma = Matematica.somar(10, 5);
		int subtracao = Matematica.subtrair(50, 10);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		System.out.println(Contador.getValor());
	
		double media = Constantes.MEDIA_DA_PROVA;
		System.out.println(Constantes.	MEDIA_DA_PROVA);
	}//	Fim do método main
}//	Fim da classe Aplicacao
