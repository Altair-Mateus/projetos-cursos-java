
public class Aplicacao 
{
	public static void main(String [] args)
	{
		ContaCorrente conta = new ContaCorrente();
		
		conta.depositar(1000);
		conta.sacar(135);
		
		System.out.println("Seu Saldo �: R$ " + conta.calcularSaldo());
		
		ContaInvestimento contaPoupanca = new ContaInvestimento();
		
		contaPoupanca.depositar(2500);
		contaPoupanca.depositar(120);
		contaPoupanca.sacar(300);
		
		System.out.println("Seu saldo �: R$ " + contaPoupanca.calcularSaldo());
		
	}//	Fim do m�todo main
}//	Fim da classe Aplicacao
