
public class Aplicacao 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Porta porta1 = new Porta(0.60, 2);
		porta1.abrir();
		
		System.out.println("Porta 1: ");
		System.out.println("Altura: " + porta1.getAltura());
		System.out.println("Largura: " + porta1.getLargura());
		System.out.println("Aberta: " + porta1.isAberta());
		
		Porta porta2 = (Porta) porta1.clone(); 
		
		System.out.println("Porta 2: ");
		System.out.println("Altura: " + porta2.getAltura());
		System.out.println("Largura: " + porta2.getLargura());
		System.out.println("Aberta: " + porta2.isAberta());
	}
}//	Fim da Classe Aplicacao
