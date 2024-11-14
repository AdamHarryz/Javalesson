/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Adam Harris
 */
public class Mainclass {
    public static void main(String[] args){
        GradeBook myGradeBook = new GradeBook();
        myGradeBook.displayMessage();
        
        StudentID id = new StudentID();
        id.displayStudentID();
        
        SubjectMarks marks = new SubjectMarks();
        marks.displayMarks();
    }
}

    
    

