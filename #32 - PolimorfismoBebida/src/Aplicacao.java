
public class Aplicacao 
{
	public static void main(String[] args) 
	{
		Preparador preparador = new Preparador();
		
		//LeiteQuente leite = new LeiteQuente();
		//preparador.prepararBebida(leite); 
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
	}//	Fim do m�todo main
	
}//	Fim da Classe Aplicacao
