/**
 * Author:  Altair Mateus T. Alencastro
 * Created: 17 de abr de 2020 | 07:59 PM
 */

package ouvintes;

//Importações
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.DAOProdutos;

import javax.swing.JDialog; 


public class ListenerSalvar implements ActionListener
{
	//	Aributos
	//	Text Field
	private JTextField nome;
	private JTextField precoCusto;
	private JTextField precoVenda;
	private JTextField lucro;
	private JTextField estoque;
	private JTextField ncm;
	private JTextField unMedida;
	private JTextField marca;
	private JTextField modelo;
	private JTextField origem;
	private JTextField icms;
	private JTextField codBarras;
	private JTextField situacao;
	private JTextField categoria;
	private JTextField infoAdicionais;
	private JDialog tela;
	
	//	Construtor
	public ListenerSalvar
		( 
			JTextField nome,
			JTextField precoCusto,
			JTextField precoVenda,
			JTextField lucro,
			JTextField estoque,
			JTextField ncm,
			JTextField unMedida,
			JTextField marca,
			JTextField modelo,
			JTextField origem,
			JTextField icms,
			JTextField codBarras,
			JTextField situacao,
			JTextField categoria,
			JTextField infoAdicionais
				
		)
			{
				this.nome           = nome;
				this.precoCusto     = precoCusto;
				this.precoVenda     = precoVenda;
				this.lucro          = lucro;
				this.estoque        = estoque;
				this.ncm            = ncm;
				this.unMedida       = unMedida;
				this.marca          = marca;
				this.modelo         = modelo;
				this.origem         = origem;
				this.icms           = icms;
				this.codBarras      = codBarras;
				this.situacao       = situacao;
				this.categoria      = categoria;
				this.infoAdicionais = infoAdicionais;
				this.tela = null;
			}//	Fim do construtor ListenerSalvar
	
	public ListenerSalvar
	(
		JDialog tela, 
		JTextField nome,
		JTextField precoCusto,
		JTextField precoVenda,
		JTextField lucro,
		JTextField estoque,
		JTextField ncm,
		JTextField unMedida,
		JTextField marca,
		JTextField modelo,
		JTextField origem,
		JTextField icms,
		JTextField codBarras,
		JTextField situacao,
		JTextField categoria,
		JTextField infoAdicionais
			
	)
		{
			this.nome           = nome;
			this.precoCusto     = precoCusto;
			this.precoVenda     = precoVenda;
			this.lucro          = lucro;
			this.estoque        = estoque;
			this.ncm            = ncm;
			this.unMedida       = unMedida;
			this.marca          = marca;
			this.modelo         = modelo;
			this.origem         = origem;
			this.icms           = icms;
			this.codBarras      = codBarras;
			this.situacao       = situacao;
			this.categoria      = categoria;
			this.infoAdicionais = infoAdicionais;
			this.tela = null;
		}//	Fim do construtor ListenerSalvar
	
    //  Local onde deve ser salvo os dados
    @Override
    public void actionPerformed(ActionEvent e)
    {      
        DAOProdutos      dao = DAOProdutos.getInstance();    
        dao.save
        (
                nome.getText(),
                Float.valueOf(precoCusto.getText()),
                Float.valueOf(precoVenda.getText()),
                Float.valueOf(lucro.getText()),
                Integer.valueOf(estoque.getText()),
                Integer.valueOf(ncm.getText()),
                unMedida.getText(),
                marca.getText(),
                modelo.getText(),
                origem.getText(),
                Float.valueOf(icms.getText()),
                Integer.valueOf(codBarras.getText()),
                situacao.getText(),
                categoria.getText(),
                infoAdicionais.getText()
                
        );      
        
        String msg = "Salvo!";      
        JOptionPane.showMessageDialog(null, msg);
    }
}//	Fim da classe ListenerSalvar
