import java.util.Scanner;

public class Media 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int op = 1, qtd_de_notas = 0;
		float notas = 0, media = 0;
			
			switch(op)
			{
				case 1:
					
					//A estrutura se repetirá até que -1 seja inserido como nota
					while(notas != -1)
					{
						//Obtendo os dados 
						System.out.println("Insira a nota (Insira -1 para parar) :" );
							notas = leia.nextFloat();
							
						if( notas <= 10 && notas >= 0)	//Operações para notas válidas
						{
							
							media += notas;		//Cada nota é somada com a anterior e armazenada na variável "media"
							qtd_de_notas +=1;	//Variável auxiliar que recebe quantas notas válidas foram inseridas
							
						} else if (notas > 10 || notas < -1) 	//Operações para notas inválidas
							{
								System.out.println("Notas Inválidas! Tente Novamente.");
								
								//As variáveis são zeradas para que não aja erros no cálculo
								media = 0;	
								notas = 0;
								qtd_de_notas = 0;
								
								//Imediatamente o bloco 1 do switch é chamado novamente para a inserção das notas corretas
								op = 1;
								
							} else
								{
									//Caso nenhuma das instruções seja seguida
									System.out.println("Houve algum erro na seção de NOTAS, contate o suporte técnico.");	
								}
					} // Fim do while
					
					
					media /= qtd_de_notas;	//Divide a soma das notas e divide pela quantidade (ambas ignorando o -1)
					
					System.out.println("\nMédia: " + media);	//Exibe a média
					
				break;
				
				default:
					System.out.println("Houve algum erro no Software, contate o suporte técnico.");
				break;
			
			} // Fim do switch
		
	} // Fim do Main
} // Fim da Classe Media
