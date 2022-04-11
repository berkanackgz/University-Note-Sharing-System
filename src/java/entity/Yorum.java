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
public class Yorum {
    private int yorum_id;
    private int ürün_id;
    String yorum;
    String mail;
    boolean onaylanma_durumu;
    Date oluşturulma_tarihi;
    Date güncellenme_tarihi;

    public Yorum(int yorum_id, int ürün_id, String yorum, String mail, boolean onaylanma_durumu, Date oluşturulma_tarihi, Date güncellenme_tarihi) {
        this.yorum_id = yorum_id;
        this.ürün_id = ürün_id;
        this.yorum = yorum;
        this.mail = mail;
        this.onaylanma_durumu = onaylanma_durumu;
        this.oluşturulma_tarihi = oluşturulma_tarihi;
        this.güncellenme_tarihi = güncellenme_tarihi;
    }

    public int getYorum_id() {
        return yorum_id;
    }

    public void setYorum_id(int yorum_id) {
        this.yorum_id = yorum_id;
    }

    public int getÜrün_id() {
        return ürün_id;
    }

    public void setÜrün_id(int ürün_id) {
        this.ürün_id = ürün_id;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isOnaylanma_durumu() {
        return onaylanma_durumu;
    }

    public void setOnaylanma_durumu(boolean onaylanma_durumu) {
        this.onaylanma_durumu = onaylanma_durumu;
    }

    public Date getOluşturulma_tarihi() {
        return oluşturulma_tarihi;
    }

    public void setOluşturulma_tarihi(Date oluşturulma_tarihi) {
        this.oluşturulma_tarihi = oluşturulma_tarihi;
    }

    public Date getGüncellenme_tarihi() {
        return güncellenme_tarihi;
    }

    public void setGüncellenme_tarihi(Date güncellenme_tarihi) {
        this.güncellenme_tarihi = güncellenme_tarihi;
    }
    
}
