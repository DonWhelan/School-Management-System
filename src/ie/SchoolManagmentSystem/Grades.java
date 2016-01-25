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
public class Grades extends Students {
    private String mathsGrade;
    private String sciGrade;
    private String techGrade;
    private String mathFeedBack;
    private String sciFeedBack;
    private String techFeedBack;
    
    public Grades(String student, String sClass, String year, String mathsGrade, String sciGrade, String techGrade, String mathFeedBack, String sciFeedBack, String techFeedBack){
        super(student,sClass,year);
        this.mathsGrade = mathsGrade;
        this.sciGrade = sciGrade;
        this.techGrade = techGrade;
        this.mathFeedBack = mathFeedBack;
        this.sciFeedBack = sciFeedBack;
        this.techFeedBack = techFeedBack;
        
    }

    public String getMathsGrade() {
        return mathsGrade;
    }

    public void setMathGrade(String mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public String getSciGrade() {
        return sciGrade;
    }

    public void setSciGrade(String sciGrade) {
        this.sciGrade = sciGrade;
    }

    public String getTechGrade() {
        return techGrade;
    }

    public void setTechGrade(String techGrade) {
        this.techGrade = techGrade;
    }

    public String getMathFeedBack() {
        return mathFeedBack;
    }

    public void setMathFeedBack(String mathFeedBack) {
        this.mathFeedBack = mathFeedBack;
    }

    public String getSciFeedBack() {
        return sciFeedBack;
    }

    public void setSciFeedBack(String sciFeedBack) {
        this.sciFeedBack = sciFeedBack;
    }

    public String getTechFeedBack() {
        return techFeedBack;
    }

    public void setTechFeedBack(String techFeedBack) {
        this.techFeedBack = techFeedBack;
    }

    

    
}
