//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/01/27 | 11:15 PM

public class data 
{
	private int dia = 0;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	// Constantes
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	
	public data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}// Fim do construtor data com parâmetros de data
	
	public data(int dia, int mes, int ano, int hora, int minuto, int segundo)
	{
		this(dia, mes, ano);
		this.hora = hora;
		
		if(hora < 0 || hora > 23)
		{
			System.out.printf("A HORA INFORMADA %d É INVÁLIDA!!! \n", hora);
			System.exit(0);
		}
		this.minuto = minuto;
		this.segundo = segundo;
	}// Fim do construtor data com parâmetros de data e hora
	
	public void imprimir(int formatoHora)
	{
		if(hora == -1)
		{
			System.out.printf("%d/%d/%d \n", dia, mes, ano);
		}//	Fim do bloco if
		
		else if(formatoHora == FORMATO_24H)
		{
			System.out.printf("%d/%d/%d %d:%d:%d \n", dia, mes, ano, hora, minuto, segundo);
		} else 
			{
				if(hora > 12)
				{
					int hora12 = hora;
					hora12 -= 12;
					System.out.printf("%d/%d/%d %d:%d:%d PM \n", dia, mes, ano, hora12, minuto, segundo);
				} else 
					{
						System.out.printf("%d/%d/%d %d:%d:%d AM \n", dia, mes, ano, hora, minuto, segundo);
					}//	Fim do bloco if-else
			}//	Fim do bloco if-else
	}// Fim do método imprimir

	// Início dos métodos Getters
	public int getDia() 
	{
		return dia;
	}// Fim do getter getDia

	public int getMes() 
	{
		return mes;
	}// Fim do getter getMes

	public int getAno() 
	{
		return ano;
	}//	Fim do getter getAno

	public int getHora() 
	{
		return hora;
	}//	Fim do getter getHora

	public int getMinuto() 
	{
		return minuto;
	}// Fim do getter getMinuto

	public int getSegundo() 
	{
		return segundo;
	}// Fim do getter getSegundo	
	
}//	Fim da classe data
