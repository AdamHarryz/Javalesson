/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Adam Harris
 */
import javax.swing.JOptionPane;

public class SubjectMarks {
    public void displayMarks() {
        String firstNumber;
        String secondNumber;
        int num1, num2, Totalmark;
        
        firstNumber = JOptionPane.showInputDialog("Enter paper 1 mark");
        secondNumber = JOptionPane.showInputDialog("Enter paper 2 mark");
        
        num1 = Integer.parseInt(firstNumber);
        num2 = Integer.parseInt(secondNumber);
        Totalmark = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "Your totalmark is "+Totalmark, "Result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        
        
        
    }
    
        
    
    
    
}
