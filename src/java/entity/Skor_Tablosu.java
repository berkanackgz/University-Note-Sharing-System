/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Skor_Tablosu {
    private int skor_id;
    private int ürün_id;
    String ders_adı;
    String bölüm;
    String üretici_ismi;
    String üretici_soyismi;
    String üretici_bölüm;
    String üretici_fakülte;

    public Skor_Tablosu(int skor_id, int ürün_id, String ders_adı, String bölüm, String üretici_ismi, String üretici_soyismi, String üretici_bölüm, String üretici_fakülte) {
        this.skor_id = skor_id;
        this.ürün_id = ürün_id;
        this.ders_adı = ders_adı;
        this.bölüm = bölüm;
        this.üretici_ismi = üretici_ismi;
        this.üretici_soyismi = üretici_soyismi;
        this.üretici_bölüm = üretici_bölüm;
        this.üretici_fakülte = üretici_fakülte;
    }

    public int getSkor_id() {
        return skor_id;
    }

    public void setSkor_id(int skor_id) {
        this.skor_id = skor_id;
    }

    public int getÜrün_id() {
        return ürün_id;
    }

    public void setÜrün_id(int ürün_id) {
        this.ürün_id = ürün_id;
    }

    public String getDers_adı() {
        return ders_adı;
    }

    public void setDers_adı(String ders_adı) {
        this.ders_adı = ders_adı;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }

    public String getÜretici_ismi() {
        return üretici_ismi;
    }

    public void setÜretici_ismi(String üretici_ismi) {
        this.üretici_ismi = üretici_ismi;
    }

    public String getÜretici_soyismi() {
        return üretici_soyismi;
    }

    public void setÜretici_soyismi(String üretici_soyismi) {
        this.üretici_soyismi = üretici_soyismi;
    }

    public String getÜretici_bölüm() {
        return üretici_bölüm;
    }

    public void setÜretici_bölüm(String üretici_bölüm) {
        this.üretici_bölüm = üretici_bölüm;
    }

    public String getÜretici_fakülte() {
        return üretici_fakülte;
    }

    public void setÜretici_fakülte(String üretici_fakülte) {
        this.üretici_fakülte = üretici_fakülte;
    }
    
}
