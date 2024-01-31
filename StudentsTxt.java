/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package students.txt.java;

import java.util.Scanner;

/**
 *
 * @author clanc
 */
public class StudentsTxt {
    public static void main(String[] args) {
     // Add Scanner Class 
       Scanner input = new Scanner(System.in);
     //    
    System.out.println("Enter your First and Last name name here");
    // output for user // 
    String Firstname = input.nextLine();
    String Lastname = input.nextLine();
        // String input reads user Firstname// 
         System.out.println("Enter your Last name here");
    // output for users Lastname // 
        // String input reads user Lastname //
    System.out.println( "Your First name is: " + Firstname );
    // System reads users first  name in an output message //
    System.out.println( "Your Last name is: " + Lastname );
     // System reads users last name in an output message //
    }
}