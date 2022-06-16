/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mateus
 */
public class Produtos 
{
    private String nome;
	private int cod;
	private double precoCusto;
	private double precoVenda;
        private double lucro;
	private int ncm;
	private String unMedida;
	private String marca;
	private String modelo;
	private String origem;
	private double icms;
	private int codBarras;
	private String categoria;
	private String situacao;
	private int estoque;
	private String infoAdicionais;
	
	
	//	Início dos métodos Getters e Setters
	public String getNome() 
	{
		return nome;
	}//	Fim do getter getNome
	public void setNome(String nome) 
	{
		this.nome = nome;
	}//	Fim do setter setNome
	
	
	public double getPrecoCusto() 
	{
		return precoCusto;
	}//	Fim do getter getPrecoCusto
	public void setPrecoCusto(double precoCusto) 
	{
		this.precoCusto = precoCusto;
	}//	Fim do setter setPrecoCusto
	
	
	public double getPrecoVenda() 
	{
		return precoVenda;
	}//	Fim do getter getPrecoVenda
	public void setPrecoVenda(double precoVenda)
	{
		this.precoVenda = precoVenda;
	}//	Fim do setter setPrecoVenda
	
        public double getLucro() 
	{
                lucro = precoVenda - (precoCusto + icms);
		return lucro;
	}//	Fim do getter getLucro
	public void setLucro(double lucro)
	{
		this.lucro = lucro;
	}//	Fim do setter setLucro
	
	public int getNcm() 
	{
		return ncm;
	}//	Fim do getter getNcm
	public void setNcm(int ncm) 
	{
		this.ncm = ncm;
	}//	Fim do setter setNcm
	
	
	public String getUnMedida() 
	{
		return unMedida;
	}//	Fim do getter getUnMedida
	public void setUnMedida(String unMedida) 
	{
		this.unMedida = unMedida;
	}//	Fim do setter setUnMedida
	
	
	public String getMarca() 
	{
		return marca;
	}//	Fim do getter getMarca
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}//	Fim do setter setMarca
	
	
	public String getModelo() 
	{
		return modelo;
	}//	Fim do getter getModelo
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}//	Fim do setter setModelo
	
	
	public String getOrigem() 
	{
		return origem;
	}//	Fim do getter getOrigem
	public void setOrigem(String origem) 
	{
		this.origem = origem;
	}//	Fim do setter setOrigem
	
	public double getIcms()
	{
		/*Cálculo de ICMS de acordo com a alíquota básica (regra geral) é de 17%, 
		aplicando-se a todas as operações e prestações internas que não possuem 
		outra alíquota específica indicada na lei.*/
		icms = (17 * precoVenda) / 100;
		return icms;
	}//	Fim do getter getIcms
        
        public void setIcms(Double icms) 
	{
		this.icms = icms;
	}//	Fim do setter setIcms
	
	public int getCodBarras() 
	{
		return codBarras;
	}//	Fim do getter getCodBarras
	public void setCodBarras(int codBarras)
	{
		this.codBarras = codBarras;
	}//	Fim do setter setCodBarras
	
	
	public String getSituacao() 
	{
		
		return situacao;
	}//	Fim do getter isAtivo
	public void setSituacao(String situacao) 
	{
		this.situacao = situacao;
	}//	Fim do setter setAtivo
	
	
	public String getCategoria()
	{
		return categoria;
	}//	Fim do getter getCategoria
	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}//	Fim do setter setCategoria
	
	public int getEstoque()
	{
		return estoque;
	}//	Fim do getter getEstoque
	public void setEstoque(int estoque)
	{
		this.estoque = estoque;
	}//	Fim do setter setEsstoque
	
	public String getInfoAdicionais() 
	{
		return infoAdicionais;
	}//	Fim do getter getInfoAdicionais
	public void setInfoAdicionais(String infoAdicionais) 
	{
		this.infoAdicionais = infoAdicionais;
	}//	Fim do setter setinfoAdicionais
	
	
	public int getCod() 
	{
		return cod;
	}//	Fim do getter getCod
	public void setCod(int cod)
	{
		this.cod = cod;
	}//	Fim do setter setCod
	
}// Fim da classe Produtos
