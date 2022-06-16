
public abstract class Item 
{
	private int posX;
	private int posY;
	
	public abstract void pegar();

	//	Métodos Getters e Setters
	public int getPosX() 
	{
		return posX;
	}//	Fim do getter getPosx
	public void setPosX(int posX) 
	{
		this.posX = posX;
	}//	Fim do setter setPosx

	public int getPosY() 
	{
		return posY;
	}//	Fim do getter getPosy
	public void setPosY(int posY) 
	{
		this.posY = posY;
	}//	Fim do setter setPosy
	
	
	
}//	Fim da classe Item
