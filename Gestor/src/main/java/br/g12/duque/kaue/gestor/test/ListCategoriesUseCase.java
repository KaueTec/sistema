/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.kaue.gestor.test;

import br.g12.duque.kaue.dao.CategoryDao;
import br.g12.duque.kaue.models.Category;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 08163
 */
public class ListCategoriesUseCase {
    public static void main(String[] args) {
        // 1. criar um array list
        ArrayList<Category> list = null;
        
        // 2. criar um objeto dao para buscar os dados
        Category cat = new Category();
        CategoryDao dao = new CategoryDao(cat);
        list = dao.findAll();
        //System.out.println(list);
        String message = "";
        for(Category c:list){
            message = message + c.getName()+"\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
