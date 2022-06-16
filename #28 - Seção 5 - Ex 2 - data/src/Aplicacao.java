
public class Aplicacao 
{
	public static void main(String[] args) 
	{
		
		data data1 = new data(10, 02, 2000, 10, 30, 10);
		data1.imprimir(data.FORMATO_12H);
		data1.imprimir(data.FORMATO_24H);
		
		data data2 = new data(15, 06, 2000, 23, 15, 20);
		data2.imprimir(data.FORMATO_12H);
		data2.imprimir(data.FORMATO_24H);
		
		data data3 = new data(5, 10, 2005);
		data3.imprimir(data.FORMATO_12H);
		data3.imprimir(data.FORMATO_24H);
		
	}//	Fim do método main
	
}// Fim da Classe Aplicacao
