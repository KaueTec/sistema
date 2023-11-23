/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.g12.duque.kaue.gestor.repositories;

import br.g12.duque.kaue.models.Category;
import java.util.ArrayList;

/**
 *
 * @author 08163
 */
public interface IRepositoryCategory {
    public boolean insert(); // Métodos abstratos // clean code
    public boolean update();
    public boolean delete();
    public ArrayList findAll();
    public Category findById(int id); // parâmetros ==> variáveis 
    
}
