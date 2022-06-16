/**
 * Author:  Altair Mateus T. Alencastro
 * Created: 17 de abr de 2020 | 07:59 PM
 */

package models;

//	Importações
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class DAOProdutos 
{
	//	Atributos
	private Connection conexao;
	private static DAOProdutos instancia;
	
	private DAOProdutos() 
	{
		
		try
		{
                        //	Tenta carregar o driver
                        String driverName = "com.mysql.cj.jdbc.Driver";
			Class.forName(driverName);
			
			//	Se o driver não carregar ir� cair na linha do ClassNotFound
			//	Par�metros de conexão com o BD
			String host = "localhost";
			String db = "system_gest";
			String url = "jdbc:mysql://"+ host + "/" + db;
			String user= "root";
			String pwd = "Study@2021!";
			
			this.conexao = DriverManager.getConnection(url, user, pwd); 
			
			//	Testa a conexão
	    if(this.conexao != null)
            {               
                System.out.println("SUCESSO NA CONEXÃO COM O BD!");
            }else
                {                  
                    System.err.println("ERRO NO BD");
                }//	Fim do bloco if-else
		} catch(ClassNotFoundException e)
			{
				//	Driver n�o foi encontrada
				System.out.println("ERRO! O DRIVER NÃO FOI ENCONTRADO!");
			} catch(SQLException e)
				{
					System.err.println("ERRO! NÃO FOI POSSÍVEL SE CONECTAR NO BD");
				}
	}//	Fim do construtor DAOProdutos
	
	public static DAOProdutos getInstance()
    {
        if (instancia == null)
        {
            instancia = new DAOProdutos();
        }
        
        return instancia;
    }// Fim do m�todo est�tico getInstance
	
	public void save
	(
			String nome, 
			double precoCusto,
			double precoVenda,
			double lucro,
			int estoque,
			int ncm,
			String unMedida,
			String marca,
			String modelo,
			String origem,
			double icms,
			int codBarras,
			String situacao,
			String categoria,
			String infoAdicionais
	)
		{
			try
			{
				PreparedStatement ps = conexao.prepareStatement("INSERT INTO produtos (nome, precoCusto, precoVenda, lucro, estoque, ncm, unMedida, marca, modelo, origem, icms, codBarras, situacao, categoria, infoAdicionais)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				
				ps.setString (1, nome);
				ps.setDouble (2, precoCusto);
				ps.setDouble (3, precoVenda);
				ps.setDouble (4, lucro);
				ps.setInt    (5, estoque);
				ps.setInt    (6, ncm);
				ps.setString (7, unMedida);
				ps.setString (8, marca);
				ps.setString (9, modelo);
				ps.setString (10, origem);
				ps.setDouble (11, icms);
				ps.setInt    (12, codBarras);
				ps.setString (13, situacao);
				ps.setString (14, categoria);
				ps.setString (15, infoAdicionais);
				
				ps.execute();
						
			}catch(SQLException ex)
	        {    
	            Logger.getLogger(DAOProdutos.class.getName()).log(Level.SEVERE, null, ex);
	        }
		}
}//	Fim da classe DAOProdutos
