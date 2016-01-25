/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.SchoolManagmentSystem;

/**
 *
 * @author Don
 */
public class Attendance {
    
    private String date;
    private String year;
    private String sClass;
    private String student1;
    private String student2;
    private String student3;
    private String student4;
    private String student5;
    private String student6;
    
    
    public Attendance(String date, String year, String sClass, String student1, String student2, String student3, String student4, String student5, String student6){
        
        this.date = date;
        this.year = year;
        this.sClass = sClass;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
        this.student5 = student5;
        this.student6 = student6;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getStudent1() {
        return student1;
    }

    public void setStudent1(String student1) {
        this.student1 = student1;
    }

    public String getStudent2() {
        return student2;
    }

    public void setStudent2(String student2) {
        this.student2 = student2;
    }

    public String getStudent3() {
        return student3;
    }

    public void setStudent3(String student3) {
        this.student3 = student3;
    }

    public String getStudent4() {
        return student4;
    }

    public void setStudent4(String student4) {
        this.student4 = student4;
    }

    public String getStudent5() {
        return student5;
    }

    public void setStudent5(String student5) {
        this.student5 = student5;
    }

    public String getStudent6() {
        return student6;
    }

    public void setStudent6(String student6) {
        this.student6 = student6;
    }
    
    
}
