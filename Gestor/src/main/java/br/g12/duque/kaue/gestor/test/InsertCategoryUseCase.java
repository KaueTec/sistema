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
public class InsertCategoryUseCase {
    public static void main(String[] args) {
        Category cat = new Category();
        String name = JOptionPane.showInputDialog("Nome:");
        String description = JOptionPane.showInputDialog("descrição:");
        cat.setName(name);
        cat.setDescription(description);
        
        CategoryDao cd = new CategoryDao(cat);
        boolean success = cd.insert();
        
        if(success){
            JOptionPane.showMessageDialog(null, "Sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
