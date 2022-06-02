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
public class Siber implements Serializable {

    private Long id;
    private String slink;
    private String sdescription;
    private Date screatedate;

    public Siber() {
    }

    public Siber(Long id, String slink, String sdescription, Date screatedate) {
        this.id = id;
        this.slink = slink;
        this.sdescription = sdescription;
        this.screatedate = screatedate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlink() {
        return slink;
    }

    public void setSlink(String slink) {
        this.slink = slink;
    }

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription;
    }

    public Date getScreatedate() {
        return screatedate;
    }

    public void setScreatedate(Date screatedate) {
        this.screatedate = screatedate;
    }

}
