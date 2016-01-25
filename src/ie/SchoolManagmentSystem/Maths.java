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
public class Maths {
    
    
    private String ans1; 
    private String ans2;
  
    
   
    
    public Maths(String ans1, String ans2){
        this.ans1 = ans1;
        this.ans2 = ans2;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getDetails(){
        return "Answer 1: "+ans1+"Answer 2: "+ans2;
    }
}

