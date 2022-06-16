//Autor: Altair Mateus T. Alencastro
//Data: 17/07/2019 | Hora: 20h25min

public class Serie_Fibonacci 
{
	public static void main(String[] args)
	{
		int n1 = 0, n2 = 1;
		
		for(int s = 0; s <= 15; s++)
		{
			System.out.println(n1 + " ");
			n1 += n2;
			n2 = n1 - n2;
			
		} //Fim do Laço For
		
	} //Fim do main
} //Fim da Classe Serie_Fibonacci
