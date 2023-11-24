/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.kaue.gestor.test;

import br.g12.duque.kaue.dao.CategoryDao;
import br.g12.duque.kaue.models.Category;
import javax.swing.JOptionPane;

/**
 *
 * @author 08163
 */
public class UpdateCategoryUseCase {
    public static void main(String[] args) {
        String strCodigo = JOptionPane.showInputDialog(null, "Digite o código");
        String nome = JOptionPane.showInputDialog(null, "novo nome:");
        String descrição = JOptionPane.showInputDialog(null, "nova descrição:");
        int codigo = Integer.valueOf(strCodigo);
        
        Category categoria = new Category(codigo, nome, descrição);
        CategoryDao dao = new CategoryDao(categoria);
        
        boolean sucesso = dao.update();
        
        if(sucesso){
            JOptionPane.showMessageDialog(null, "Registro atualizado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro na atualização");
        }
    }
}
