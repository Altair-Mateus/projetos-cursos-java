
public class Aplicacao
{
	public static void main(String[] args)
	{
		int s = 10, t = 0, soma = 0;
		
		//Tarefa 1
		System.out.println("Números inteiros de 10 a 25: \n");
		
		while(s <= 25)
		{
			System.out.println(s);
			s++;
		}
		
		System.out.println("\n================================================================== \n");
		
		//Tarefa 2
		System.out.println("Pulando de 2 em 2 até 100");
		for(int e = 1; e < 100; e +=2)
		{
			System.out.println(e);
		}
		
		
		//Tarefa 3
		while(soma <= 100)
		{
			t++; soma += t;
			System.out.println("Número: " + t);
			System.out.println("Soma: " + soma);
			
		}
		
		System.out.println("\n================================================================== \n");
		
		//Tarefa 4
		System.out.println("Tabuada do 9: ");
		for(int f = 0; f <= 10; f++)
		{
			System.out.println(f + " x 9 = " + (f * 9));
		}
		
	}
}
