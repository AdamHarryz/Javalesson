/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Adam Harris
 */
import java.util.Scanner;
public class Task2 {

    public void DisplayTask2(){
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
        
        
        
        }    }}
    

    
