//	Developer: Altair Mateus T. Alencastro
//	Last Update: 2019/09/24 | 10:25 PM

public class ContaBancaria 
{
	private int numConta;
	private boolean ativa;
	private double saldo;
	
	public void sacar(double valor)
	{
		if(valor < 0)
		{
			System.out.println("VOC� EST� SEM SALDO.");
			return;
		} else
		{
			System.out.printf("Voc� sacou R$ %f da sua conta. \n", valor);
			saldo -= valor;
		}//	Fim do bloco if-else
		
	}//	Fim do m�todo sacar
	
	public void depositar(double valor)
	{
		if(valor < 0)
		{
			System.out.println("VOC� N�O PODE DEPOSITAR UM VALOR MENOR QUE 0.");
			return;
		} else
		{
			System.out.printf("Voc� depositou R$ %f na sua conta. \n", valor);
			saldo += valor;
		}//	Fim do bloco if-else
	}//	Fim do m�todo depositar
	
	//	M�todos Getters
	public int getNumConta() 
	{
		return numConta;
	}//	Fim do getter getNumConta
	
	public boolean isAtiva() 
	{
		return ativa;
	}//	Fim do getter isAtiva
	
	public double getSaldo() 
	{
		System.out.printf("Saldo da Conta %d : %f" , numConta, saldo);
		return saldo;
	}//	Fim do getter getSaldo
	//	Fim dos M�todos Getters
	
	
	//	M�todos Setters
	public void setNumConta(int numConta) 
	{
		if(numConta > 0)
		{
			this.numConta = numConta;
		}
	}//	Fim do setter setNumConta

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}//	Fim do setter setAtiva
	
}//	Fim da classe ContaBancaria
