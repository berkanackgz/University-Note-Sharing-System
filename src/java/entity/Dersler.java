/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Dersler {
    private int ders_id;
    String isim;
    String soyisim;
    String bölüm;
    String fakülte;

    public Dersler(int ders_id, String isim, String soyisim, String bölüm, String fakülte) {
        this.ders_id = ders_id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.bölüm = bölüm;
        this.fakülte = fakülte;
    }

    public int getDers_id() {
        return ders_id;
    }

    public void setDers_id(int ders_id) {
        this.ders_id = ders_id;
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
    
}
