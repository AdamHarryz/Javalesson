/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author Adam Harris
 */

/*import java.util.Scanner;

public class GradeMark {
    public static void main(String[] args){
        int mark = 0;
        char grade;
       
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter marks :"); //LETAK MARKAH KAT SINI
        mark = read.nextInt();
        
        if(mark >=85)
            System.out.println("Grade is A");
        
        else if(mark >=70)
            System.out.println("Grade is B");
        
        else if(mark >=55)
            System.out.println("Grade is C");
        
        else if(mark >=40)
            System.out.println("Grade is D");
        
        else
            System.out.println("FAILED");
        
        
        
    }
    
}*/

import javax.swing.JOptionPane;

public class GradeMark {

    // Method to calculate and return an array with the grades and pass/fail counts
    public static int[] calculateGrades(int[] marks) {
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
        int passCount = 0, failCount = 0;

        for (int mark : marks) {
            if (mark >= 80) {
                gradeA++;
                passCount++;
            } else if (mark >= 70) {
                gradeB++;
                passCount++;
            } else if (mark >= 60) {
                gradeC++;
                passCount++;
            } else if (mark >= 50) {
                gradeD++;
                passCount++;
            } else {
                gradeF++;
                failCount++;
            }
        }

        // Return an array with counts for [gradeA, gradeB, gradeC, gradeD, gradeF, passCount, failCount]
        return new int[]{gradeA, gradeB, gradeC, gradeD, gradeF, passCount, failCount};
    }

    // Method to display results using JOptionPane
    public static void displayResults(int[] gradeCounts, int passCount, int failCount) {
        String message = "Grade:\n"
                + "A: " + gradeCounts[0] + "\n"
                + "B: " + gradeCounts[1] + "\n"
                + "C: " + gradeCounts[2] + "\n"
                + "D: " + gradeCounts[3] + "\n"
                + "F: " + gradeCounts[4] + "\n"
                + "Number of students who passed: " + passCount + "\n"
                + "Number of students who failed: " + failCount + "\n";

        if (passCount > failCount) {
            message += "Bonus to instructor!\n";
        } else {
            message += "Instructor needs improvement.\n";
        }

        // Display the final message in a dialog box
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            // Input number of students using JOptionPane
            String numStudentsStr = JOptionPane.showInputDialog("Enter the number of students:");
            int numStudents = Integer.parseInt(numStudentsStr);

            int[] marks = new int[numStudents];

            // Input marks for each student using JOptionPane
            for (int i = 0; i < numStudents; i++) {
                int mark;
                do {
                    String markStr = JOptionPane.showInputDialog("Enter mark for student " + (i + 1) + " (0-100):");
                    mark = Integer.parseInt(markStr);

                    if (mark < 0 || mark > 100) {
                        JOptionPane.showMessageDialog(null, "Invalid mark! Please enter a number between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);

                marks[i] = mark;
            }

            // Calculate grades and pass/fail counts
            int[] gradeCounts = calculateGrades(marks);
            int passCount = gradeCounts[5];
            int failCount = gradeCounts[6];

            // Display the results
            displayResults(gradeCounts, passCount, failCount);

            // Ask if the user wants to continue
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue", JOptionPane.YES_NO_OPTION);

            if (response != JOptionPane.YES_OPTION) {
                continueProgram = false;
                JOptionPane.showMessageDialog(null, "Exiting program...");
            }
        }
    }
}


