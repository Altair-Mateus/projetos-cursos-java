//Developer: Altair Mateus T. Alencastro
//Last Update 17/07/2019 | 23h36min 
import java.util.Scanner;

public class ParOuImpar 
{
	public static void main(String[] args)
	{
		//Método para ler dado via teclado
		Scanner leia = new Scanner(System.in);
		
		int s, op;
		
		System.out.println("=================================================================");
		System.out.println("Digite um número inteiro positivo: ");
			s = leia.nextInt(); 	//Lendo o dado
		System.out.println("=================================================================");
		
		while(s <= 1000)
		{
			if(s % 2 == 1)
			{
				op = 1; 	//Se for ímpar chama a opção 1
			} else 
				{
					op = 2; 	//Se for par chama a opção 2
				} //Fim do bloco If-Else
		
			switch(op)
			{
				case 1:
					s *= 2;
					
					System.out.println(s);
				break;
			
				case 2:
				
					s += 5;
					
					System.out.println(s);
				break;
			} //Fim do bloco switch
			
		}// Fim do bloco while
		
	}//Fim do main
	
} //Fim da Classe ParOuImpar
