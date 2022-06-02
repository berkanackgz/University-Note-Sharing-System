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
public class Internet implements Serializable {

    private Long id;
    private String ilink;
    private String idescription;
    private Date icreatedate;

    public Internet() {
    }

    public Internet(Long id, String ilink, String idescription, Date icreatedate) {
        this.id = id;
        this.ilink = ilink;
        this.idescription = idescription;
        this.icreatedate = icreatedate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIlink() {
        return ilink;
    }

    public void setIlink(String ilink) {
        this.ilink = ilink;
    }

    public String getIdescription() {
        return idescription;
    }

    public void setIdescription(String idescription) {
        this.idescription = idescription;
    }

    public Date getIcreatedate() {
        return icreatedate;
    }

    public void setIcreatedate(Date icreatedate) {
        this.icreatedate = icreatedate;
    }

}
