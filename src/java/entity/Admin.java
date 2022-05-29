/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Admin {
    private int AdminId;
    private String AdminName;
    private String AdminLastName;
    private String AdminMail;
    private String AdminPhoneNumber;

    public Admin(int AdminId, String AdminName, String AdminLastName, String AdminMail, String AdminPhoneNumber) {
        this.AdminId = AdminId;
        this.AdminName = AdminName;
        this.AdminLastName = AdminLastName;
        this.AdminMail = AdminMail;
        this.AdminPhoneNumber = AdminPhoneNumber;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int AdminId) {
        this.AdminId = AdminId;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    public String getAdminLastName() {
        return AdminLastName;
    }

    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    public String getAdminMail() {
        return AdminMail;
    }

    public void setAdminMail(String AdminMail) {
        this.AdminMail = AdminMail;
    }

    public String getAdminPhoneNumber() {
        return AdminPhoneNumber;
    }

    public void setAdminPhoneNumber(String AdminPhoneNumber) {
        this.AdminPhoneNumber = AdminPhoneNumber;
    }
    
    
}
