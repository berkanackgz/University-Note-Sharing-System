/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Ürün {
    private int ürün_id;
    private int üretici_id;
    String içerik;
    boolean onaylanma_durumu;

    public Ürün(int ürün_id, int üretici_id, String içerik, boolean onaylanma_durumu) {
        this.ürün_id = ürün_id;
        this.üretici_id = üretici_id;
        this.içerik = içerik;
        this.onaylanma_durumu = onaylanma_durumu;
    }

    public int getÜrün_id() {
        return ürün_id;
    }

    public void setÜrün_id(int ürün_id) {
        this.ürün_id = ürün_id;
    }

    public int getÜretici_id() {
        return üretici_id;
    }

    public void setÜretici_id(int üretici_id) {
        this.üretici_id = üretici_id;
    }

    public String getIçerik() {
        return içerik;
    }

    public void setIçerik(String içerik) {
        this.içerik = içerik;
    }

    public boolean isOnaylanma_durumu() {
        return onaylanma_durumu;
    }

    public void setOnaylanma_durumu(boolean onaylanma_durumu) {
        this.onaylanma_durumu = onaylanma_durumu;
    }
    
}
