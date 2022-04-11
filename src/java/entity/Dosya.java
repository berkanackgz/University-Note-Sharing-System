/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Dosya {
    private int dosya_id;
    String dosya_yolu;
    String dosya_uzantısı;
    float boyut;

    public Dosya(int dosya_id, String dosya_yolu, String dosya_uzantısı, float boyut) {
        this.dosya_id = dosya_id;
        this.dosya_yolu = dosya_yolu;
        this.dosya_uzantısı = dosya_uzantısı;
        this.boyut = boyut;
    }

    public int getDosya_id() {
        return dosya_id;
    }

    public void setDosya_id(int dosya_id) {
        this.dosya_id = dosya_id;
    }

    public String getDosya_yolu() {
        return dosya_yolu;
    }

    public void setDosya_yolu(String dosya_yolu) {
        this.dosya_yolu = dosya_yolu;
    }

    public String getDosya_uzantısı() {
        return dosya_uzantısı;
    }

    public void setDosya_uzantısı(String dosya_uzantısı) {
        this.dosya_uzantısı = dosya_uzantısı;
    }

    public float getBoyut() {
        return boyut;
    }

    public void setBoyut(float boyut) {
        this.boyut = boyut;
    }
    
}
