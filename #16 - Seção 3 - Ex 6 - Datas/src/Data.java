// Developer: Altair Mateus T. Alencastro
// Last Update: 19/07/2019 | 14h22min
import java.util.Scanner;

public class Data 
{
	public static void main(String [] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int dia, mes, ano;
		boolean bissexto;
		
		//Lê a data
		System.out.println("Insira o dia: ");
			dia = leia.nextInt();
		System.out.println("Insira o mês: ");
			mes = leia.nextInt();
		System.out.println("Insira o ano: ");
			ano = leia.nextInt();
		System.out.println("========================================================================== \n");
		
		//if else 1 - Verifica se o ano é bissexto
		if(ano % 4 == 0)
		{
			bissexto = true;
		} else
		{
			bissexto = false;
		} // Fim do bloco If-else 1
		
		//if-else 2 - Verifica a existência da data 
		if(mes == 2 && ano > 0 && bissexto == true && dia > 0 && dia <= 29) //Ano Bissexto
		{
			
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " é Válida!");
			
		} else if(mes == 2 && ano > 0 && bissexto == false && dia > 0 && dia <= 28) //Fevereiro 28 dias
			{
				
				System.out.println("A data " + dia + "/" + mes + "/" + ano + " é Válida!");
				
			} else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && ano > 0 && dia > 0 && dia <= 30) //Meses com 30 dias
				{
				
					System.out.println("A data " + dia + "/" + mes + "/" + ano + " é Válida!");
					
				} else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && ano > 0 && dia > 0 && dia <= 31) //Meses com 31 dias
					{
					
						System.out.println("A data " + dia + "/" + mes + "/" + ano + " é Válida!");
						
					} else
						{
							System.out.println("A data " + dia + "/" + mes + "/" + ano + " é Inválida!");
						}
		
		
	}// Fim do main
	
} //Fim da Classe Data
