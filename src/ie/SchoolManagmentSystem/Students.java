/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.SchoolManagmentSystem;

import java.io.Serializable;

/**
 *
 * @author Don
 */
public class Students implements Serializable {
    
    
    private String student; 
    private String sClass;
    private String year;
    
   
    
    public Students(String student, String sClass, String year){
        this.student = student;
        this.sClass = sClass;
        this.year = year;
        
        
    }
    
        public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDetails(){
        return "Student Name: "+student+"Class: "+sClass+ "Year: "+year;
    }
}

