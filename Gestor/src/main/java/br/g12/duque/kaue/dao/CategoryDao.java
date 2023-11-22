/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.kaue.dao;

import br.g12.duque.kaue.gestor.Conexao;
import br.g12.duque.kaue.gestor.InterBanco;
import br.g12.duque.kaue.models.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 08163
 */
public class CategoryDao implements InterBanco{
    
    private Category category;
    
    public CategoryDao(Category cat){
        this.category = cat;
    }
    //Annotation ou Decorator que indica:
    //Que vou sobreescrever um método
            
    @Override 
    public boolean insert() {
        String sql = "INSERT INTO categories "
                +"(name, description) VALUES "
                +"(?,?)";
        boolean success = false;
        Connection conn = Conexao.getConnection();
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, category.getName());
            pst.setString(2, category.getDescription());
            pst.executeUpdate();
            success = false;
            
        }catch(SQLException ex){
            System.out.println("Erro:"+ex.getMessage());
            success = false;
        }
        return success;
    }

    @Override
    public boolean update() {
        // 1. Definir o comanfo sql que será executado
        
        String sql = "UPDATE categories SET "
                +"SET name = ?, DESCRIPTION = ? "
                +"WHERE id = ?";
        // 2. Definir uma variável que dirá se a operação foi bem sucedida
        
        boolean success = false;
        // 3. Conectar a aplicação no banco de dados
        
        Connection conn = Conexao.getConnection();
        // 4. Fazer o tratamento de possiveis erros da aplicação
        
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, category.getName());
            pst.setString(2, category.getDescription());
            pst.setInt(3, category.getId());
            pst.executeUpdate();
            success = true;
        }
        catch(SQLException ex){
            System.out.println("Erro na operação: "+ ex.getMessage());
            success = false;
        }
        
        // 5. Aviso o aplicativo se deu certo ou errado
        return success;
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
