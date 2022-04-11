/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Kullanıcı_Rolü {
    private int kullanıcı_id;
    String isim;
    String soyisim;
    String öğrenci_no;
    String bölüm;
    String fakülte;
    String alım_geçmişi;

    public Kullanıcı_Rolü(int kullanıcı_id, String isim, String soyisim, String öğrenci_no, String bölüm, String fakülte, String alım_geçmişi) {
        this.kullanıcı_id = kullanıcı_id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.öğrenci_no = öğrenci_no;
        this.bölüm = bölüm;
        this.fakülte = fakülte;
        this.alım_geçmişi = alım_geçmişi;
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

    public String getAlım_geçmişi() {
        return alım_geçmişi;
    }

    public void setAlım_geçmişi(String alım_geçmişi) {
        this.alım_geçmişi = alım_geçmişi;
    }
    
}
