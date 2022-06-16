
public class ContaCorrente extends ContaBancaria
{
	//	Método que calcula o saldo subtraindo os impostos
	@Override
	public double calcularSaldo()
	{
		return saldo - (saldo * 0.1);
	}//	Fim do método calcularSaldo
}
