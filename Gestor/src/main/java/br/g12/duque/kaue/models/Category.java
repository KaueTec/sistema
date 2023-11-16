/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.kaue.models;

/**
 *
 * @author 08163
 */
public class Category {
    // Atributos da classe
    private int id;
    private String name;
    private String description;
    
    // Construtor Category cat = new Category()
    public Category(){
        //System.out.println("Categoria criada.");
    }
    
    // Construtor com parâmentros
    public Category(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    // Construtor para carregamento do Combobox
    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    // Construtor que será usado no Form de cadastro
    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public static void main(String[] args) {
        Category cat1 = new Category();
        System.out.println(cat1);
        
        Category cat2 = new Category("Bebidas", "Bebidas nao alcolicas");
        System.out.println(cat2.name+"\n"+cat2.description);
        
        
    }
    
    // GETTERS E SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
