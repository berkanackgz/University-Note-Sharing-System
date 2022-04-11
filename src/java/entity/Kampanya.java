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
public class Kampanya {
    private int kampanya_id;
    float kampanya_yüzdesi;
    Date başlangıç_tarihi;
    Date bitiş_tarihi;

    public Kampanya(int kampanya_id, float kampanya_yüzdesi, Date başlangıç_tarihi, Date bitiş_tarihi) {
        this.kampanya_id = kampanya_id;
        this.kampanya_yüzdesi = kampanya_yüzdesi;
        this.başlangıç_tarihi = başlangıç_tarihi;
        this.bitiş_tarihi = bitiş_tarihi;
    }

    public int getKampanya_id() {
        return kampanya_id;
    }

    public void setKampanya_id(int kampanya_id) {
        this.kampanya_id = kampanya_id;
    }

    public float getKampanya_yüzdesi() {
        return kampanya_yüzdesi;
    }

    public void setKampanya_yüzdesi(float kampanya_yüzdesi) {
        this.kampanya_yüzdesi = kampanya_yüzdesi;
    }

    public Date getBaşlangıç_tarihi() {
        return başlangıç_tarihi;
    }

    public void setBaşlangıç_tarihi(Date başlangıç_tarihi) {
        this.başlangıç_tarihi = başlangıç_tarihi;
    }

    public Date getBitiş_tarihi() {
        return bitiş_tarihi;
    }

    public void setBitiş_tarihi(Date bitiş_tarihi) {
        this.bitiş_tarihi = bitiş_tarihi;
    }
    
}
