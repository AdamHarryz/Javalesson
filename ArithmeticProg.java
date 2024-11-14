/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author Adam Harris
 */



//question 1
/*public class ArithmeticProg {
    
    public static void main(String[] args) {
        
        int a = 8, b = 9;
        
        //addition
        int sum = a + b;
        System.out.println("1. "+ a +" + " + b + " = " + sum);
        
        //subtraction
        int difference = a - b;
        System.out.println("2. "+ a +" - " + b + " = " + difference);
        
        //division
        int divide = a / b;
        System.out.println("3. "+ a +" / " + b + " = " + divide);
        
        //multiplication
        int multiple = a * b;
        System.out.println("4. "+ a +" x " + b + " = " + multiple);
        
        //modules
        int modules = a % b;
        System.out.println("5. "+ a +" % " + b + " = " + modules);
        
        //increment
        int incre = ++a;
        System.out.println("6. Increment of 8 is " + incre);
        
        //decrement
        int decre = --b;
        System.out.println("7. Decrement of 9 is " + decre);
                     
    }
    
}*/



//question 2
/*import java.util.Scanner;

public class ArithmeticProg {

public static void main(String[] args) {
        
        String name, hobby, favoritefood;
        int age;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter name :");
        name = read.nextLine();
        
        
        System.out.print("Enter age :");
        age=read.nextInt();
        
        
        System.out.print("Enter hobby :");
        read.nextLine();
        hobby = read.nextLine();
        
        
        System.out.print("Enter favorite food :");
        favoritefood = read.nextLine();
        read.close();
        
        
        System.out.println("\nName :"+name);
        System.out.println("Age :"+age);
        System.out.println("Hobby :"+hobby);
        System.out.println("Favorite food :"+favoritefood);
    }
    
}*/

//question 3
/*import java.util.Scanner;

public class ArithmeticProg {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = read.nextInt();

        int currentYear = 2024; 
        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age);
    }
}*/

//question 4
/*import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        
        String  name, ID, subject;
        Double  test1, test2;
        
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        name = read.nextLine();
        
        System.out.print("Enter ID : ");
        ID = read.nextLine();
        
        System.out.print("Enter Subject : ");
        subject = read.nextLine();
        
        System.out.print("Enter Your test 1 marks : ");
        test1 = read.nextDouble();
        
        System.out.print("Enter Your test 2 marks : ");
        test2 = read.nextDouble();
        
        Double Averagemark = (test1 + test2) / 2;
        
        System.out.println("\nName :"+name);
        System.out.println("ID :"+ID);
        System.out.println("Subject :"+subject);
        System.out.println("Test 1 :"+test1);
        System.out.println("Test 2 :"+test2);
        System.out.println("Average mark :"+Averagemark);                    
    }
}*/

//question 5
/*import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        
        String  name;
        Double  price, discount;
        int quantity;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter item name : ");
        name = read.nextLine();
        
        System.out.print("Enter price : ");
        price = read.nextDouble();
        
        System.out.print("Enter quantity : ");
        quantity = read.nextInt();
        
        System.out.print("Enter discount rate : ");
        discount = read.nextDouble();
        
        double totalPrice = price * quantity;
        double discountAmount = (discount/100) * totalPrice;
        double priceAfterDiscount = totalPrice - discountAmount;
        
        System.out.println("\nName :"+name);
        System.out.println("price :"+price);
        System.out.println("quantity :"+quantity);
        System.out.println("discount :"+discount);
        System.out.println("totalPrice :"+totalPrice);
        System.out.println("discountAmount :"+discountAmount);
        System.out.println("priceAfterDiscount :"+priceAfterDiscount);        
    }
}*/

//question 6
/*import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        
        
        Double  weight, height;
        
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter Your weight : ");
        weight = read.nextDouble();
        
        System.out.print("Enter your height in meter : ");
        height = read.nextDouble();
        
               
        double BMI = weight / (height * height);
      
        
        System.out.println("\nYour BMI is :"+BMI);
   
    }
}*/


