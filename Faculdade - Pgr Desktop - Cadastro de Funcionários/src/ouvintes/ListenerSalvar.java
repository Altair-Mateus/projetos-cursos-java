package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JDialog; 
import models.DAOFuncionarios;

public class ListenerSalvar implements ActionListener
{
	//	Atributos
	private JTextField nome;
	private JTextField rg;
	private JTextField cpf;
	private JTextField cargo;
	private JDialog tela;
	
	//	Construtor
	public ListenerSalvar(JTextField nome, JTextField rg, JTextField cpf, JTextField cargo)
	{
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.cargo = cargo;
		this.tela = null;
	}//	Fim do construtor ListenerSalvar
	
	public ListenerSalvar(JDialog tela, JTextField nome, JTextField rg, JTextField cpf, JTextField cargo) 
	{
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.cargo = cargo;
        this.tela = tela;
    }

	
    //  Local onde deve ser salvo os dados
    @Override
    public void actionPerformed(ActionEvent e)
    {      
        DAOFuncionarios      dao = DAOFuncionarios.getInstance();    
        dao.save
        (
                nome.getText(), 
                rg.getText(), 
                cpf.getText(), 
                cargo.getText()
        );      
        
        String msg = "Salvo!";      
        System.out.println(msg);}	
	
}//	Fim da classe ListenerSalvar
