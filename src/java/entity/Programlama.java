/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author berka
 */
public class Programlama implements Serializable {

    private Long id;
    private String plink;
    private String pdescription;
    private Date pcreatedate;

    public Programlama() {
    }

    public Programlama(Long id, String plink, String pdescription, Date pcreatedate) {
        this.id = id;
        this.plink = plink;
        this.pdescription = pdescription;
        this.pcreatedate = pcreatedate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlink() {
        return plink;
    }

    public void setPlink(String plink) {
        this.plink = plink;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public Date getPcreatedate() {
        return pcreatedate;
    }

    public void setPcreatedate(Date pcreatedate) {
        this.pcreatedate = pcreatedate;
    }

}
