
public class Relogio 
{
	// Atributos
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	// Métodos
	void acertarRelogio(int hora, int minuto, int segundo)
	{
		hora = hora % 12;
		
		ponteiroHora.posicao = hora;
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}// Fim do método acertarRelogio()
	
	int lerHora()
	{
		return ponteiroHora.posicao;
	}// Fim do método lerHora()
	
	int lerMinuto()
	{
		return ponteiroMinuto.posicao * 5;
	}// Fim do método lerMinuto()
	
	int lerSegundo()
	{
		return ponteiroSegundo.posicao * 5;
	}// Fim do método lerSegundo
	
}// Fim da classe Relogio
