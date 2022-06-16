
public class Relogio 
{
	// Atributos
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	// M�todos
	void acertarRelogio(int hora, int minuto, int segundo)
	{
		hora = hora % 12;
		
		ponteiroHora.posicao = hora;
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}// Fim do m�todo acertarRelogio()
	
	int lerHora()
	{
		return ponteiroHora.posicao;
	}// Fim do m�todo lerHora()
	
	int lerMinuto()
	{
		return ponteiroMinuto.posicao * 5;
	}// Fim do m�todo lerMinuto()
	
	int lerSegundo()
	{
		return ponteiroSegundo.posicao * 5;
	}// Fim do m�todo lerSegundo
	
}// Fim da classe Relogio
