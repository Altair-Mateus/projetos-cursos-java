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
public class Imc 
{
    private String nome;
	private double altura;
	private double peso;
	
	//	Início dos Getters e Setters
	public String getNome()
	{
		return nome;
	}//	Fim do getter getNome
	public void setNome(String nome) 
	{
		this.nome = nome;
	}//	Fim do setter setNome
	
	public double getAltura() 
	{
		return altura;
	}//	Fim do getter getAltura
	public void setAltura(double altura)
	{
		this.altura = altura;
	}//	Fim do setter setNome
	
	public double getPeso() 
	{
		return peso;
	}//	Fim do getter getPeso
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}//	Fim do setter setNome
	
	public double calculoImc()
	{
		return peso * (Math.pow(altura,2));
	}
	
}// Fim da classe Imc
