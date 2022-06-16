/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mateus
 */
public class ConnectionFactory 
{
    //	Tenta carregar o driver
    String driverName = "com.mysql.cj.jdbc.Driver";

			
    //	Se o driver não carregar ir� cair na linha do ClassNotFound
    //	Par�metros de conexão com o BD
    String host = "localhost";
    String db = "system_gest";
    String time = "useTimezone=true&serverTimezone=UTC";
    String url = "jdbc:mysql://"+ host + "/" + db + "?" + time;
    String user= "root";
    String pwd = "Study@2021!";
                        
    public Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection(url, user, pwd);
        } catch (Exception erro)
            {
                throw new RuntimeException(erro);
            }
    }
}// Fim da classe ConnectionFactory
