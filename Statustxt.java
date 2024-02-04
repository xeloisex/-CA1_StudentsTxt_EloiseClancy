/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students.txt.java;

import java.util.Scanner;
//public class starts here//
public class Statustxt {
//public class stated here // {
// main string starts here // 
    public static void main(String[] args) {
        //import scanner //
       Scanner input = new Scanner(System.in);

        System.out.println("Enter your First name:");
        String Firstname = input.nextLine();

        System.out.println("Enter your Last name:");
        String Lastname = input.nextLine();

        System.out.println("Enter the number of classes (1-8):");
        int ClassNum = input.nextInt();

        System.out.println("Enter your student number (e.g., 23ab123):");
        String StudentNum = input.next();

        // Validate data
        if (validateData(Firstname, Lastname, ClassNum, StudentNum)) {
            // Determine workload
            String workload = determineWorkload(ClassNum);

            // Print results
            System.out.println("Student Information:");
            System.out.println("Name: " + Firstname + " " + Lastname);
            System.out.println("Number of Classes: " + ClassNum);
            System.out.println("Student Number: " + StudentNum);
            System.out.println("Workload: " + workload);
        } else {
            System.out.println("Error: Invalid input. Please check the input format.");
            //eroor message displayed if data entered is incorrect //
        }
    }

    private static boolean validateData(String Firstname, String Lastname, int ClassNum, String StudentNum) {
        // Data validate here//
        // if data is valid thiscode will build succesfully //
        return true;
    }

    private static String determineWorkload(int ClassNum) {
        return "Full Time";
        // Code ends here showing the users input as the final message//
    }
}
