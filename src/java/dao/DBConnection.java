/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author berka
 */
//BERKAN AÇIKGÖZ
//MUHAMMET AKKAN
//BERZA BOZKURT
//METİN KÖROĞLU
public class DBConnection {
        
    public Connection connect(){
        Connection c = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/university","postgres","147369");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return c;
    }
    
}
