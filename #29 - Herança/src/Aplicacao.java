// Developer: Altair Mateus T Alencastro
// Last Update: 2020/01/30 | 12:05 PM

public class Aplicacao 
{
	public static void main(String[] args)
	{
		
		System.out.println("Carro");
		Carro c = new Carro();
		c.setMarca("TOYOTA");
		c.setModelo("COROLLA");
		c.setAno(2018);
		c.setQuatroPortas(true);
		c.imprimirDados();
		//c.buzinar();
		
		System.out.println("\nMotocileta");
		Motocicleta m = new Motocicleta();
		m.setMarca("HONDA");
		m.setModelo("BIZ");
		m.setAno(2000);
		m.imprimirDados();
		/*m.empinar();
		m.buzinar();
		
		Caminhao cam = new Caminhao();
		cam.buzinar();*/
		
	}// Fim do método main
}// Fim da classe Aplicacao
