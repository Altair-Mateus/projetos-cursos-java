
public class Aplicacao 
{
	public static void main(String[] args) 
	{
		Relogio rel1 = new Relogio();
		
		rel1.acertarRelogio(8, 20, 35);
		
		System.out.println("Posi��o hora: " + rel1.ponteiroHora.posicao);
		System.out.println("Posi��o minuto: " + rel1.ponteiroMinuto.posicao);
		System.out.println("Posi��o segundo: " + rel1.ponteiroSegundo.posicao);
		
		int hora = rel1.lerHora();
		int minuto = rel1.lerMinuto();
		int segundo = rel1.lerSegundo();
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
	}//	Fim do m�todo main
}// Fim da classe Aplicacao
