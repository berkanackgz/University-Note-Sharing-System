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
public class Offer {
    /*
    Güncellendi=25.05.22
    *Get set düzenlemeleri yapıldı.
    */
    private int KampanyaId;
    private String KampanyaName;
    private Date KampanyaStartDate;
    private Date KampanyaFinishDate;
    private double KampanyaIndirimYuzdesi;

    public Offer(int KampanyaId, String KampanyaName, Date KampanyaStartDate, Date KampanyaFinishDate, double KampanyaIndirimYuzdesi) {
        this.KampanyaId = KampanyaId;
        this.KampanyaName = KampanyaName;
        this.KampanyaStartDate = KampanyaStartDate;
        this.KampanyaFinishDate = KampanyaFinishDate;
        this.KampanyaIndirimYuzdesi = KampanyaIndirimYuzdesi;
    }

    public int getKampanyaId() {
        return KampanyaId;
    }

    public void setKampanyaId(int KampanyaId) {
        this.KampanyaId = KampanyaId;
    }

    public String getKampanyaName() {
        return KampanyaName;
    }

    public void setKampanyaName(String KampanyaName) {
        this.KampanyaName = KampanyaName;
    }

    public Date getKampanyaStartDate() {
        return KampanyaStartDate;
    }

    public void setKampanyaStartDate(Date KampanyaStartDate) {
        this.KampanyaStartDate = KampanyaStartDate;
    }

    public Date getKampanyaFinishDate() {
        return KampanyaFinishDate;
    }

    public void setKampanyaFinishDate(Date KampanyaFinishDate) {
        this.KampanyaFinishDate = KampanyaFinishDate;
    }

    public double getKampanyaIndirimYuzdesi() {
        return KampanyaIndirimYuzdesi;
    }

    public void setKampanyaIndirimYuzdesi(double KampanyaIndirimYuzdesi) {
        this.KampanyaIndirimYuzdesi = KampanyaIndirimYuzdesi;
    }
    
    
}
