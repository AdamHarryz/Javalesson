/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author Adam Harris
 */

/*import java.util.Scanner; // import 
public class KISmark {
    public static void main(String[] args) {
        int latenumber = 0; // declare variable int sebab nombor
        float deductmarks = (float) 0.3; // declare variable float untuk kiraan
        float totalKISmark = 0; // declare variable float untuk kiraan
        float balanceKISmark; // declare variable float untuk kiraan
        
        Scanner read = new Scanner(System.in);// kena ada import java scanner
        
        System.out.print("enter latenumber :");// kena ada import java scanner
        latenumber = read.nextInt();// untuk read atas
        
        
        if(latenumber > 3){ // 
            
        
            totalKISmark = latenumber * deductmarks; // formula kiraan
            System.out.println(" totalkismark :" +totalKISmark); // display output
            
            balanceKISmark = 10 - totalKISmark; // formula kiraan
            System.out.println(" Your balance KIS mark :" +balanceKISmark); // display output
            
            
            
        }
        
    }
    
}*/


/*import java.util.Scanner;
public class KISmark {
    public static void main(String[] args){
        int grade;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("enter grade :");
        grade = read.nextInt();
        
        if(grade >= 60)
            System.out.println("Passed");
        else
            System.out.println("Failed");
        
        
    }
}*/



import java.util.Scanner;
import javax.swing.JOptionPane;

public class KISmark {
    
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
            } else {  // Corrected this condition for failing students
                gradeF++;
                failCount++;
            }
        }

        // Return an array with counts for [gradeA, gradeB, gradeC, gradeD, gradeF, passCount, failCount]
        return new int[]{gradeA, gradeB, gradeC, gradeD, gradeF, passCount, failCount};
    }

    // Method to display results using JOptionPane
    public static void displayResults(int[] gradeCounts, int passCount, int failCount) {
        String message = "Grade Distribution:\n"
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
        Scanner read = new Scanner(System.in);

        while (continueProgram) {
            // Input number of students using JOptionPane
            String numStudentsStr = JOptionPane.showInputDialog("Enter the number of students:");
            int numStudents = Integer.parseInt(numStudentsStr);

            int[] marks = new int[numStudents];

            // Input marks for each student using Scanner
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter student " + (i + 1) + " mark (0-100): ");  // Updated to start student number at 1
                int mark = read.nextInt();

                // Input validation for mark (must be between 0 and 100)
                while (mark < 0 || mark > 100) {
                    if (mark < 0) {
                        JOptionPane.showMessageDialog(null, "Invalid mark! The mark cannot be less than 0.");
                    } else if (mark > 100) {
                        JOptionPane.showMessageDialog(null, "Invalid mark! The mark cannot be more than 100.");
                    }
                    System.out.print("Please re-enter student " + (i + 1) + " mark (0-100): ");
                    mark = read.nextInt();
                }

                // Store the valid mark in the marks array
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





