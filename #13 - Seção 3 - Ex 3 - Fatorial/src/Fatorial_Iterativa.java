
public class Fatorial_Iterativa 
{
	public static void main(String[] args)
	{
		int numero = 10, resultado = 1;
		
		for(int s = 2; s <= numero; s++)
		{
			resultado *= s;
		} //Fim do bloco for
		
		System.out.println("O fatorial de " + numero + " é " + resultado);
		
	} //Fim do main
} //Fim da Classe Fatorial_Iterativa
