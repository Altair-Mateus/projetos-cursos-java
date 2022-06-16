
public abstract class ContaBancaria 
{
	protected double saldo;
	
	public void depositar(double valor)
	{
		saldo += valor;
	}//	Fim do m�todo depositar
	
	public void sacar(double valor)
	{
		saldo -= valor;
	}//	Fim do m�todo sacar
	
	public void transferir(double valor, ContaBancaria conta)
	{
		sacar(valor);
		conta.depositar(valor);
	}//	Fim do m�todo transferir
	
	//	M�todo abstrato para calcular o saldo da conta
	public abstract double calcularSaldo();
	
}//	Fim da classe ContaBancaria
