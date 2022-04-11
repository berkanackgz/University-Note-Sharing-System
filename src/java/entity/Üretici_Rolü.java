/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author CASPER
 */
public class Üretici_Rolü {
    private int üretici_id;
    private int kullanıcı_id;
    String isim;
    String soyisim;
    String öğrenci_no;
    String bölüm;
    String fakülte;
    Date satış_geçmişi;

    public Üretici_Rolü(int üretici_id, int kullanıcı_id, String isim, String soyisim, String öğrenci_no, String bölüm, String fakülte, Date satış_geçmişi) {
        this.üretici_id = üretici_id;
        this.kullanıcı_id = kullanıcı_id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.öğrenci_no = öğrenci_no;
        this.bölüm = bölüm;
        this.fakülte = fakülte;
        this.satış_geçmişi = satış_geçmişi;
    }

    public int getÜretici_id() {
        return üretici_id;
    }

    public void setÜretici_id(int üretici_id) {
        this.üretici_id = üretici_id;
    }

    public int getKullanıcı_id() {
        return kullanıcı_id;
    }

    public void setKullanıcı_id(int kullanıcı_id) {
        this.kullanıcı_id = kullanıcı_id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getÖğrenci_no() {
        return öğrenci_no;
    }

    public void setÖğrenci_no(String öğrenci_no) {
        this.öğrenci_no = öğrenci_no;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }

    public String getFakülte() {
        return fakülte;
    }

    public void setFakülte(String fakülte) {
        this.fakülte = fakülte;
    }

    public Date getSatış_geçmişi() {
        return satış_geçmişi;
    }

    public void setSatış_geçmişi(Date satış_geçmişi) {
        this.satış_geçmişi = satış_geçmişi;
    }
    
}
