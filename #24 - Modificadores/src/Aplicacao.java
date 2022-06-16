//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/24 | 10:25 PM

public class Aplicacao 
{
	public static void main(String[] args) 
	{
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(54334);
		c.setAtiva(true);
		
		/*	O saldo não pode ser alterado sem realizar
		os precessos de depositar e/ou sacar */
		c.depositar(1000);
		c.sacar(200);
		
		c.getSaldo();
	}//	Fim do método main
}//	Fim da classe Aplicacao
