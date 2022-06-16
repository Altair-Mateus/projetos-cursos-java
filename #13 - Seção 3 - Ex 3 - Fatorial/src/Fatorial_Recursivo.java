import java.util.Scanner;

public class Fatorial_Recursivo 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite: ");
		numero = ler.nextInt();
		
		int resultado = calcula_fatorial(numero);
		
		System.out.println("O fatorial de " + numero + " é " + resultado);
		
	} //Fim do main

	static int calcula_fatorial(int num)
	{
		if(num == 0)
		{
			return 1;
			
		} //Fim do bloco if
		
		return num * calcula_fatorial(num - 1);
	} //Fim da função calcula_fatorial
	
} //Fim da Classe Fatorial_Recursivo
