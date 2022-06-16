
public class Aplicacao 
{
	public static void main(String [] args)
	{
		ContaCorrente conta = new ContaCorrente();
		
		conta.depositar(1000);
		conta.sacar(135);
		
		System.out.println("Seu Saldo é: R$ " + conta.calcularSaldo());
		
		ContaInvestimento contaPoupanca = new ContaInvestimento();
		
		contaPoupanca.depositar(2500);
		contaPoupanca.depositar(120);
		contaPoupanca.sacar(300);
		
		System.out.println("Seu saldo é: R$ " + contaPoupanca.calcularSaldo());
		
	}//	Fim do método main
}//	Fim da classe Aplicacao
