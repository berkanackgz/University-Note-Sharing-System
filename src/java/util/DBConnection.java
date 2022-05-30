/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

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
public abstract class DBConnection {

    private Connection connection;

    public Connection getConnect() {
        if (this.connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/WebAplication", "postgres", "12345");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }

}
