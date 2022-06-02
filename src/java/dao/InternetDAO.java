/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Internet;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author berka
 */
public class InternetDAO extends DBConnection {

    public List<Internet> readList() {
        List<Internet> list = new ArrayList<>();

        try {
            Statement st = this.getConnect().createStatement();
            ResultSet rs = st.executeQuery("select * from internet");

            while (rs.next()) {
                list.add(new Internet(rs.getLong("id"), rs.getString("ilink"), rs.getString("idescription"), rs.getDate("icreatedate")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void create(Internet i) {
        try {
            Statement st = this.getConnect().createStatement();
            st.executeUpdate("insert into internet(ilink,idescription) values ('"+i.getIlink()+"','"+i.getIdescription()+"')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void update(Internet i) {
        try {
            Statement st = this.getConnect().createStatement();
            st.executeUpdate("update internet set title='"+i.getIlink()+"' where id="+i.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void delete(Internet i) {
        try {
            Statement st = this.getConnect().createStatement();
            st.executeUpdate("delete from internet where id="+i.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
