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
					
					//A estrutura se repetir� at� que -1 seja inserido como nota
					while(notas != -1)
					{
						//Obtendo os dados 
						System.out.println("Insira a nota (Insira -1 para parar) :" );
							notas = leia.nextFloat();
							
						if( notas <= 10 && notas >= 0)	//Opera��es para notas v�lidas
						{
							
							media += notas;		//Cada nota � somada com a anterior e armazenada na vari�vel "media"
							qtd_de_notas +=1;	//Vari�vel auxiliar que recebe quantas notas v�lidas foram inseridas
							
						} else if (notas > 10 || notas < -1) 	//Opera��es para notas inv�lidas
							{
								System.out.println("Notas Inv�lidas! Tente Novamente.");
								
								//As vari�veis s�o zeradas para que n�o aja erros no c�lculo
								media = 0;	
								notas = 0;
								qtd_de_notas = 0;
								
								//Imediatamente o bloco 1 do switch � chamado novamente para a inser��o das notas corretas
								op = 1;
								
							} else
								{
									//Caso nenhuma das instru��es seja seguida
									System.out.println("Houve algum erro na se��o de NOTAS, contate o suporte t�cnico.");	
								}
					} // Fim do while
					
					
					media /= qtd_de_notas;	//Divide a soma das notas e divide pela quantidade (ambas ignorando o -1)
					
					System.out.println("\nM�dia: " + media);	//Exibe a m�dia
					
				break;
				
				default:
					System.out.println("Houve algum erro no Software, contate o suporte t�cnico.");
				break;
			
			} // Fim do switch
		
	} // Fim do Main
} // Fim da Classe Media
