//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/17 | 12:24 AM

import java.util.Scanner;

public class Aplicacao 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int op = 0;
		
		while(op >= 0 && op <= 5)
		{
			System.out.println("\n-----------------------------------------------");
			System.out.println("\tCálculos de Área");
			System.out.println("-----------------------------------------------\n");
			
			System.out.println("[1] - TRIÂNGULO");
			System.out.println("[2] - QUADRADO");
			System.out.println("[3] - CIRCUNFERÊNCIA");
			System.out.println("[4] - TRAPÉZIO");
			System.out.println("[5] - SAIR");
			
			System.out.printf("Escolha uma opção e pressione ENTER: ");
				op = input.nextInt();
			System.out.println("\n-----------------------------------------------\n");
			
			switch(op)
			{
				case 1:
					Triangulo triangle = new Triangulo();
					
					System.out.println("Opção Escolhida: [1] - TRIÂNGULO\n");
					
					System.out.printf("Informe a Base: ");
						triangle.base = input.nextDouble();
					System.out.printf("Informe a Altura: ");
						triangle.altura = input.nextDouble();	
						
					triangle.calcularArea();
					
				break;
				
				case 2:
					Quadrado square = new Quadrado();
					
					System.out.println("Opção Escolhida: [2] - QUADRADO\n");
					
					System.out.printf("Informe a Medida do Lado: ");
						square.lado = input.nextDouble();
					
					square.calcularArea();
				break;
				
				case 3:
					Circunferencia circle = new Circunferencia();
					
					System.out.println("Opção Escolhida: [3] - CIRCUNFERÊNCIA\n");
					
					System.out.printf("Informe o Raio: ");
						circle.raio = input.nextDouble();
					
					circle.calcularArea();
				break;
				
				case 4:
					Trapezio trapeze = new Trapezio();
					
					System.out.println("Opção Escolhida: [4] - TRAPÉZIO\n");
					
					System.out.printf("Informe a Base Maior: ");
						trapeze.baseMaior = input.nextDouble();
					System.out.printf("Informe a Base Menor: ");
						trapeze.baseMenor = input.nextDouble();
					System.out.printf("Informe a Altura: ");
						trapeze.altura = input.nextDouble();
						
					trapeze.calcularArea();
				break;
				
				case 5:
					System.out.println("SAINDO DO SISTEMA...");
					System.exit(0);
				break;
			}//	Fim do bloco switch
		}// Fim do bloco While
	
		//	Fechando o objeto input
		input.close();
		
	}//	Fim do método main
}//	Fim da classe Aplicacao
