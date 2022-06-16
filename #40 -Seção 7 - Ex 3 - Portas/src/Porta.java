
public class Porta implements Cloneable
{
	private double altura;
	private double largura;
	private boolean aberta;
	
	public Porta(double altura, double largura)
	{
		this.altura = altura;
		this.largura = largura;
		
		//	Porta inicia fechada
		this.aberta = false;
	}
	
	public void abrir()
	{
		aberta = true;
	}//	Fim do m�todo abrir()
	
	public void fechar()
	{
		aberta = false;
	}//	Fim do m�todo fechar()
	
	public double getAltura()
	{
		return altura;
	}//	Fim do getter getAltura
	
	public double getLargura()
	{
		return largura;
	}//	Fim do getter getLargura
	
	public boolean isAberta()
	{
		return aberta;
	}// Fim do getter isAberta
	
	/*
	 * O m�todo clone() � declarado na classe Object. Ele � sobrescrito pelas classes que desejam criar
	 * c�pias de objetos da pr�pria classe. S� � poss�vel utiliz�-lo se a classe implementar a interface 
	 * Cloneable.
	 */
	public Object clone() throws CloneNotSupportedException {
		// Cria um novo objeto e copia os valores dos atributos para este novo objeto
		Porta p = new Porta(this.altura, this.largura);
		p.aberta = this.aberta;
		
		// Retorna o novo objeto, que � uma c�pia do objeto anterior
		return p;
	}
}
