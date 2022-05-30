/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Skor_Table {
    /*
    Güncellendi=25.05.22
    Get setler güncellendi.
    */
    private int ProductId;
    private String LessonName;
    private String LessonSection;
    private int ProducerId;
    private String ProducerName;
    private String ProducerLastName;
    

    public Skor_Table(int ProductId, String LessonName, String LessonSection, int ProducerId, String ProducerName, String ProducerLastName) {
        this.ProductId = ProductId;
        this.LessonName = LessonName;
        this.LessonSection = LessonSection;
        this.ProducerId = ProducerId;
        this.ProducerName = ProducerName;
        this.ProducerLastName = ProducerLastName;
        
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public String getLessonName() {
        return LessonName;
    }

    public void setLessonName(String LessonName) {
        this.LessonName = LessonName;
    }

    public String getLessonSection() {
        return LessonSection;
    }

    public void setLessonSection(String LessonSection) {
        this.LessonSection = LessonSection;
    }

    public int getProducerId() {
        return ProducerId;
    }

    public void setProducerId(int ProducerId) {
        this.ProducerId = ProducerId;
    }

    public String getProducerName() {
        return ProducerName;
    }

    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    public String getProducerLastName() {
        return ProducerLastName;
    }

    public void setProducerLastName(String ProducerLastName) {
        this.ProducerLastName = ProducerLastName;
    }

    
    
    
    
}
