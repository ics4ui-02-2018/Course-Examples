/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPExample;

/**
 *
 * @author lamon
 */
public class Student {
    // instance variables/class variables/fields
    private String name;
    private int studentNumber;
    private int grade;
    
    // constructor
    public Student(String sName, int sNumber, int sGrade){
        name = sName;
        studentNumber = sNumber;
        grade = sGrade;
    }
    
    // class methods
    public String getName(){
        return name;
    }
    
    
    
    public int getGrade(){
        return grade;
    }
    
    public int getStudentNumber(){
        return studentNumber;
    }
    
    public void speak(){
        System.out.println("Blah Blah Blah");
    }
    
   
    @Override
    public String toString(){
       String output = "Name: " + name + "\nStudent Number: " + studentNumber + "\nGrade: " + grade +"\n\n";
       return output;
    }
    
}
