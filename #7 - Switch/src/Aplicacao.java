
public class Aplicacao 
{
	public static void main(String[] args)
	{
		int num = 15;
		
		//Exibe o valor com base no dado armazenado na vari�vel
		switch(num)
		{
			case 5:
				System.out.println("O n�mero � 5!");
			break;
			
			case 10:
				System.out.println("O n�mero � 10!");
			break;
			
			case 15:
				System.out.println("O n�mero � 15!");
			break;
			
			default:
				System.out.println("O n�mero � outro!");
			break;
		}
	}
}
