
package models;

//  Importações
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Mateus
 */
public class DAOFuncionarios 
{
    //  Atributos
    private Connection conexao;
    private static DAOFuncionarios instancia;
    
    private DAOFuncionarios()
    {
        try
        {            
            //tenta carregar o driver            
            String      driverName      = "com.mysql.jdbc.Driver";           
            Class.forName(driverName);           
            
            //se nao carregar, vai cair na linha do ClassNotFound           
            //parametros  de  conexao  ao  banco            
            String      host    = "localhost";            
            String      db      = "cad_locadora"; 
            String      time    = "useTimezone=true&serverTimezone=UTC";
            String      url     = "jdbc:mysql://"+host + "/" + db + "?" + time;            
            String      user    = "root";            
            String      pwd     = "Study@2021!"; 
            
            this.conexao =  DriverManager.getConnection(url, user, pwd); 	
            // testa
            if(this.conexao !=null)
                {               
                    System.out.println("SUCESSO NA CONEX�O COM O BD!");
                }else
                    {                  
                        System.err.println("ERRO NO BD");
                    }
    }
    catch(ClassNotFoundException e)
        {            
            // aqui quer dizer que o driver não foi encontrado            
            System.out.println("O   driver   n�o foi encontrado");
        }
        
    catch(SQLException e)
        {           
            System.err.println("N�o    foi    poss�vel conectar-se ao banco");
        }
    }// Fim do construtor DAOFuncionarios
    
    public static DAOFuncionarios getInstance()
    {
        if (instancia == null)
        {
            instancia = new DAOFuncionarios();
        }
        
        return instancia;
    }// Fim do método estático getInstance
    
    //  Método que irá receber os dados a serem salvos
    public void  save(String  nome,  String  rg, String cpf, String cargo)
    {
        try
        {            
            PreparedStatement ps = conexao.prepareStatement
                (
                    "INSERT       INTO       funcionarios (nome, rg, cpf, cargo)"
                    + "VALUES  (?,  ?,  ?,  ?)"); 
            
            ps.setString(1, nome);            
            ps.setString(2, rg);            
            ps.setString(3, cpf);           
            ps.setString(4, cargo);            
            ps.execute();
        }
        catch(SQLException ex)
        {    
            Logger.getLogger(DAOFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// Fim do método save
    
    public DefaultListModel<Funcionario> list()
    {
        DefaultListModel<Funcionario> model = new DefaultListModel<>();
        
        try
        {
            PreparedStatement      ps      = conexao.prepareStatement("SELECT   *   FROM   funcionarios");            
            ResultSet      rs = ps.executeQuery();
            
            while(rs.next())
            {                 
                model.addElement(new Funcionario
                    (
                            rs.getString("nome"),
                            rs.getString("cpf"),
                            rs.getString("rg"),
                            rs.getString("cargo"),
                            rs.getInt("id")
                    )
                );
            }
            
            return model;
        } catch(SQLException ex)
            {    
               Logger.getLogger(DAOFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
}// Fim da classe DAOFuncionarios
