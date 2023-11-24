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
public class FindByIdUseCase {
    public static void main(String[] args) {
        // 1. criar um objeto do tipo category
        Category category = new Category();
        
        // 2. criar um objeto para armazenar a categoria econtrada (se houve)
        Category categoryFound = null;
        
        // 3. executar o método findById do Dao
        String strCodigo = JOptionPane.showInputDialog(null,"Digite o código" );
        int codigo = Integer.valueOf(strCodigo);
        category.setId(codigo);
        CategoryDao dao = new CategoryDao(category);
        categoryFound = dao.findById();
        System.out.println(categoryFound);
    }
}
