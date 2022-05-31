/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class TT {
    private int fiyat_id;
    private int ders_id;
    float kat_sayı;
    float satış_fiyatı;

    public TT(int fiyat_id, int ders_id, float kat_sayı, float satış_fiyatı) {
        this.fiyat_id = fiyat_id;
        this.ders_id = ders_id;
        this.kat_sayı = kat_sayı;
        this.satış_fiyatı = satış_fiyatı;
    }

    public int getFiyat_id() {
        return fiyat_id;
    }

    public void setFiyat_id(int fiyat_id) {
        this.fiyat_id = fiyat_id;
    }

    public int getDers_id() {
        return ders_id;
    }

    public void setDers_id(int ders_id) {
        this.ders_id = ders_id;
    }

    public float getKat_sayı() {
        return kat_sayı;
    }

    public void setKat_sayı(float kat_sayı) {
        this.kat_sayı = kat_sayı;
    }

    public float getSatış_fiyatı() {
        return satış_fiyatı;
    }

    public void setSatış_fiyatı(float satış_fiyatı) {
        this.satış_fiyatı = satış_fiyatı;
    }
    
}
