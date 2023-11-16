/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.kaue.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author 08163
 */
public class Conexao {
    public static String USERNAME = "root"; //Constante
    public static String PASSWORD = "usbw"; //Constante
    public static String DBNAME = "sistema"; //Constante
    public static String SERVER = "jdbc:mysql://localhost:3306"; //Constante
    
    // Método que realiza a conexão com o banco de dados
    // 
    public static Connection getConnection(){
         Connection conn = null;
         String message = "";
        // Tratamento de exceções em java
        try{
            conn = DriverManager.getConnection(SERVER+"/"+DBNAME, 
                    USERNAME, PASSWORD);
            message = "DEU CERTO HAHHAHAAHAHAH";
        }catch(SQLException ex){
            message = "BURRO IMBECIL LIXO";
            System.out.println(message);
            ex.printStackTrace();
        }
        System.out.println(message);
        return conn;
    }
}
