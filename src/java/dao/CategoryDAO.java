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
public class CategoryDAO extends DBConnection {

    public List<Category> readList() {
        List<Category> list = new ArrayList<>();
        try {
            Statement st = this.getConnect().createStatement();
            ResultSet rs = st.executeQuery("select*from Category");
            while (rs.next()) {
                list.add(new Category(rs.getLong("id"), rs.getString("title"), rs.getDate("created"), rs.getDate("Update")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void Create(Category c) {
        try {
            Statement st = this.getConnect().createStatement();
            st.execute("insert into category(title) values ('" + c.getTitle() + "where id=" + c.getCategoryId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Update(Category c) {
        try {
            Statement st = this.getConnect().createStatement();
            st.execute("select*from category");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Delete(Category c) {
        try {
            Statement st = this.getConnect().createStatement();
            st.execute("delete from category where id=" + c.getCategoryId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
