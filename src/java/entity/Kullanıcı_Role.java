/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Kullanıcı_Role {
    /*
    Güncellendi 25.05.22==CTOR ve Get-Set güncellemeleri
    */
    private int UserId;
    private String UserName;
    private String UserLastName;
    private String UserMail;
    private String StudentNumber;
    private String User_Faculty;
    private String User_Section;

    public Kullanıcı_Role(int UserId, String UserName, String UserLastName, String UserMail, String StudentNumber, String User_Faculty, String User_Section) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserLastName = UserLastName;
        this.UserMail = UserMail;
        this.StudentNumber = StudentNumber;
        this.User_Faculty = User_Faculty;
        this.User_Section = User_Section;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String UserLastName) {
        this.UserLastName = UserLastName;
    }

    public String getUserMail() {
        return UserMail;
    }

    public void setUserMail(String UserMail) {
        this.UserMail = UserMail;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getUser_Faculty() {
        return User_Faculty;
    }

    public void setUser_Faculty(String User_Faculty) {
        this.User_Faculty = User_Faculty;
    }

    public String getUser_Section() {
        return User_Section;
    }

    public void setUser_Section(String User_Section) {
        this.User_Section = User_Section;
    }
    
    
}
