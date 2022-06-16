
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
	}//	Fim do método abrir()
	
	public void fechar()
	{
		aberta = false;
	}//	Fim do método fechar()
	
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
	 * O método clone() é declarado na classe Object. Ele é sobrescrito pelas classes que desejam criar
	 * cópias de objetos da própria classe. Só é possível utilizá-lo se a classe implementar a interface 
	 * Cloneable.
	 */
	public Object clone() throws CloneNotSupportedException {
		// Cria um novo objeto e copia os valores dos atributos para este novo objeto
		Porta p = new Porta(this.altura, this.largura);
		p.aberta = this.aberta;
		
		// Retorna o novo objeto, que é uma cópia do objeto anterior
		return p;
	}
}
