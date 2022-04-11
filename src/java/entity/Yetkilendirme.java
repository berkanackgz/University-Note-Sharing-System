/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Yetkilendirme {
    private int yetki_id;
    private String yetki_alanı;

    public Yetkilendirme(int yetki_id, String yetki_alanı) {
        this.yetki_id = yetki_id;
        this.yetki_alanı = yetki_alanı;
    }

    public int getYetki_id() {
        return yetki_id;
    }

    public void setYetki_id(int yetki_id) {
        this.yetki_id = yetki_id;
    }

    public String getYetki_alanı() {
        return yetki_alanı;
    }

    public void setYetki_alanı(String yetki_alanı) {
        this.yetki_alanı = yetki_alanı;
    }
    
}
