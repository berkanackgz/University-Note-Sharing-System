/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Category;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;


/**
 *
 * @author CASPER
 */
public class CategoryDAO extends DBConnection{
    
    private List<Category> readList(){
        List<Category> list = new ArrayList<>();
        try {
            Statement st=this.getConnect().createStatement();
            ResultSet rs=st.executeQuery("select*from Category");
            while(rs.next()){
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    
    
}
