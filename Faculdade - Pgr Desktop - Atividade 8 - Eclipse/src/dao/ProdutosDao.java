/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Produtos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.ConnectionFactory;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateus
 */
public class ProdutosDao 
{
    private Connection conexao;
    
     public ProdutosDao() 
     {
        this.conexao = new ConnectionFactory().getConnection();
    }
    public void cadProduto(Produtos obj)
    {
        try
        {
            String sql = "INSERT INTO produtos (nome, precoCusto, precoVenda, icms, lucro, estoque, ncm, unMedida, marca, modelo, origem, codBarras, situacao, categoria, infoAdicionais)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString (1, obj.getNome());
            stmt.setDouble (2, obj.getPrecoCusto());
            stmt.setDouble (3, obj.getPrecoVenda());
            stmt.setDouble (4, obj.getIcms());
            stmt.setDouble (5, obj.getLucro());
            stmt.setInt    (6, obj.getEstoque());
            stmt.setInt    (7, obj.getNcm());
            stmt.setString (8, obj.getUnMedida());
            stmt.setString (9, obj.getMarca());
            stmt.setString (10, obj.getModelo());
            stmt.setString (11, obj.getOrigem());
            stmt.setInt    (12, obj.getCodBarras());
            stmt.setString (13, obj.getSituacao());
            stmt.setString (14, obj.getCategoria());
            stmt.setString (15, obj.getInfoAdicionais());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO COM SUCESSO!");
        } catch(SQLException erro)
                {
                    JOptionPane.showMessageDialog(null, "ERRO: " +  erro);
                }
    }// Fim do método cadProduto
    
    public void alterarProduto(Produtos obj)
    {
        try
        {
            String sql = "UPDATE produtos SET nome = ?, precoCusto= ?, precoVenda = ?, icms = ?, lucro = ?, estoque = ?, ncm = ?, unMedida= ?, marca = ?, modelo = ?, origem = ?, codBarras = ?, situacao = ?, categoria = ?, infoAdicionais = ? WHERE cod = ?";
            
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString (1, obj.getNome());
            stmt.setDouble (2, obj.getPrecoCusto());
            stmt.setDouble (3, obj.getPrecoVenda());
            stmt.setDouble (11, obj.getIcms());
            stmt.setDouble (4, obj.getLucro());
            stmt.setInt    (5, obj.getEstoque());
            stmt.setInt    (6, obj.getNcm());
            stmt.setString (7, obj.getUnMedida());
            stmt.setString (8, obj.getMarca());
            stmt.setString (9, obj.getModelo());
            stmt.setString (10, obj.getOrigem());
            stmt.setInt    (12, obj.getCodBarras());
            stmt.setString (13, obj.getSituacao());
            stmt.setString (14, obj.getCategoria());
            stmt.setString (15, obj.getInfoAdicionais());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO COM SUCESSO!");
        } catch(SQLException erro)
                {
                    JOptionPane.showMessageDialog(null, "ERRO: " +  erro);
                }
    }// Fim do método alterarProduto
    
    public void excluirProduto(Produtos obj)
    {
        try
        {
            String sql = "DELETE FROM produtos WHERE cod = ?";
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, obj.getCod());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "PRODUTO EXCLUÍDO COM SUCESSO!");
        } catch(SQLException erro)
                {
                    JOptionPane.showMessageDialog(null, "ERRO: " +  erro);
                }
    }// Fim do método excluirProduto
    
    
    public List<Produtos> listarProduto() throws SQLException
    {
        List<Produtos> lista = new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM produtos";
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next())
            {
                Produtos obj = new Produtos();
                
                obj.setCod(rs.getInt("cod"));
                obj.setNome(rs.getString("nome"));
                obj.setPrecoCusto(rs.getDouble("precoCusto"));
                obj.setPrecoVenda(rs.getDouble("precoVenda"));
                obj.setIcms(rs.getDouble("icms"));
                obj.setLucro(rs.getDouble("lucro"));
                obj.setEstoque(rs.getInt("estoque"));
                obj.setNcm(rs.getInt("ncm"));
                obj.setUnMedida(rs.getString("unMedida"));
                obj.setMarca(rs.getString("marca"));
                obj.setModelo(rs.getString("modelo"));
                obj.setOrigem(rs.getString("origem"));
                obj.setCodBarras(rs.getInt("codBarras"));
                obj.setSituacao(rs.getString("situacao"));
                obj.setCategoria(rs.getString("categoria"));
                obj.setInfoAdicionais(rs.getString("infoAdicionais"));
                
                lista.add(obj);
            
            }// Fim do bloco de repetição while
            
            return lista;
            
        } catch(SQLException erro)
                {
                    JOptionPane.showMessageDialog(null, "ERRO: " +  erro);
                    return null;
                }
    }// Fim do método listarProduto
    
    public List<Produtos> buscaCad(String nome)
    {
        List<Produtos> lista = new ArrayList<>();
        
        try
        {
            String sql = "SELECT * FROM produtos WHERE nome LIKE ?";
            
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Produtos obj= new Produtos();
                
                obj.setCod(rs.getInt("cod"));
                obj.setNome(rs.getString("nome"));
                obj.setPrecoCusto(rs.getDouble("precoCusto"));
                obj.setPrecoVenda(rs.getDouble("precoVenda"));
                obj.setIcms(rs.getDouble("icms"));
                obj.setLucro(rs.getDouble("lucro"));
                obj.setEstoque(rs.getInt("estoque"));
                obj.setNcm(rs.getInt("ncm"));
                obj.setUnMedida(rs.getString("unMedida"));
                obj.setMarca(rs.getString("marca"));
                obj.setModelo(rs.getString("modelo"));
                obj.setOrigem(rs.getString("origem"));
                obj.setCodBarras(rs.getInt("codBarras"));
                obj.setSituacao(rs.getString("situacao"));
                obj.setCategoria(rs.getString("categoria"));
                obj.setInfoAdicionais(rs.getString("infoAdicionais"));
                
                lista.add(obj);
            }// Fim do bloco de repetição while
            
            return lista;
        } catch(SQLException erro)
                {
                    JOptionPane.showMessageDialog(null, "ERRO: " +  erro);
                    return null;
                }
    }// Fim do método buscaCad
}
