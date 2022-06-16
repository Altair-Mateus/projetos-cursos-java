// Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/06/16 | 1:40 PM

import java.util.Scanner;

public class Aplicacao
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Fracao fracao1 = new Fracao();
		
		System.out.printf("Insira o Numerador da Fração 1: ");
			fracao1.numerador1 = input.nextInt();
		System.out.printf("Insira o Denominador da Fração 1: ");
			fracao1.denominador1 = input.nextInt();
		System.out.printf("Insira o Numerador da Fração 2: ");
			fracao1.numerador2 = input.nextInt();
		System.out.printf("Insira o Denominador da Fração 2: ");
			fracao1.denominador2 = input.nextInt();
			
		fracao1.multiplica_fracoes();
	}
		
}//	Fim da Classe Aplicacao
