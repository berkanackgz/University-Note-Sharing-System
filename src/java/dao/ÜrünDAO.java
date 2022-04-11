/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;
import entity.Ürün;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author berka
 */
public class ÜrünDAO extends DBConnection {

    
       
    public void create (Ürün k){
        try{
            Statement st = this.connect().createStatement();
            String query = "insert into Ürün (ürün_id, üretici_id, içerik, onaylanma_durumu) values"
                + "('" + k.getÜrün_id() + "', '" + k.getÜretici_id() + "', '" + k.getIçerik() + "','"+k.isOnaylanma_durumu()+ "')";
        st.executeUpdate(query);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Ürün k) {

        try {
            Statement st = this.connect().createStatement();
            String query = "update Ürün set içerik='" + k.getIçerik()+ "', onaylanma_durumu='" + k.isOnaylanma_durumu()+ "' where ürün_id=" + k.getÜrün_id();

            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void delete(Ürün k) {

        try {
            Statement st = this.connect().createStatement();
            String query = "delete from Ürün where ürün_id=" + k.getÜrün_id();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Ürün> getList() {
        List<Ürün> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from Ürün order by ürün_id asc";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new Ürün(rs.getInt("ürün_id"), rs.getInt("üretici_id"), rs.getString("içerik"), rs.getBoolean("onaylanma_durumu")));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
