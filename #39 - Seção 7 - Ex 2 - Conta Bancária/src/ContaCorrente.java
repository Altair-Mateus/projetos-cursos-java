
public class ContaCorrente extends ContaBancaria
{
	//	M�todo que calcula o saldo subtraindo os impostos
	@Override
	public double calcularSaldo()
	{
		return saldo - (saldo * 0.1);
	}//	Fim do m�todo calcularSaldo
}
