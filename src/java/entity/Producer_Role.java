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
public class Producer_Role { //Güncellendi 25.05.22
    private int ProducerId;
    private String ProducerName;
    private String ProducerLastName;
    private String StudentNumber;
    private String ProducerFaculty;
    private String ProducerSection;

    public Producer_Role(int ProducerId, String ProducerName, String ProducerLastName, String StudentNumber, String ProducerFaculty, String ProducerSection) {
        this.ProducerId = ProducerId;
        this.ProducerName = ProducerName;
        this.ProducerLastName = ProducerLastName;
        this.StudentNumber = StudentNumber;
        this.ProducerFaculty = ProducerFaculty;
        this.ProducerSection = ProducerSection;
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

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getProducerFaculty() {
        return ProducerFaculty;
    }

    public void setProducerFaculty(String ProducerFaculty) {
        this.ProducerFaculty = ProducerFaculty;
    }

    public String getProducerSection() {
        return ProducerSection;
    }

    public void setProducerSection(String ProducerSection) {
        this.ProducerSection = ProducerSection;
    }
    
    
}
