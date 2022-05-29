/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author CASPER
 */
public class Lessons { 
/*
    Güncellendi=25.05.22
    *Get set ler güncellendi.
    */
    private int LessonId;
    private String LessonName;
    private String LessonFaculty;
    private String LessonSection;

    public Lessons(int LessonId, String LessonName, String LessonFaculty, String LessonSection) {
        this.LessonId = LessonId;
        this.LessonName = LessonName;
        this.LessonFaculty = LessonFaculty;
        this.LessonSection = LessonSection;
    }

    public int getLessonId() {
        return LessonId;
    }

    public void setLessonId(int LessonId) {
        this.LessonId = LessonId;
    }

    public String getLessonName() {
        return LessonName;
    }

    public void setLessonName(String LessonName) {
        this.LessonName = LessonName;
    }

    public String getLessonFaculty() {
        return LessonFaculty;
    }

    public void setLessonFaculty(String LessonFaculty) {
        this.LessonFaculty = LessonFaculty;
    }

    public String getLessonSection() {
        return LessonSection;
    }

    public void setLessonSection(String LessonSection) {
        this.LessonSection = LessonSection;
    }
    
    
    
}
