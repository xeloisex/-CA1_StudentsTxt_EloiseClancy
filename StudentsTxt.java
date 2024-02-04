/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package students.txt.java;
//imports stored here//
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//public class stated here
public class StudentsTxt {

    public static void main(String[] args) {
        processStudentData("statustxt.txt");
    }
     // links two files together//
    private static void processStudentData(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Splitting the line into components
                String[] data = line.split(",");

                // Extracting individual components
                String Firstname = data[0].trim();
                String Lastname = data[1].trim();
                int ClassNum = Integer.parseInt(data[2].trim());
                String StudentNum = data[3].trim();
                int Classnum = 0;

                // Validating data
                if (validateData(Firstname, Lastname, Classnum, StudentNum)) {
                    // Determining workload
                    String workload = determineWorkload(ClassNum);
                    

                    // Writing to status.txt
                    writeToStatustxt(StudentNum, Lastname, workload);
                }
            }
        } catch (IOException e) {
        }
    }

    private static boolean validateData(String Firstname, String Lastname, int ClassNum, String StudentNum) {
        // Rule a
        if (!Firstname.matches("[a-zA-Z]+")) {
            System.out.println("Error: First name must contain only alphabetic characters.");
            return false;
        }

        // Rule b
        if (!Lastname.matches("[a-zA-Z0-9]+\\s[a-zA-Z0-9]*")) {
            System.out.println("Error: Last name must be separated from the first name by a single space and can contain letters and/or numbers.");
            return false;
        }

        // Rule c
        if (!(1 <= ClassNum && ClassNum <= 8)) {
            System.out.println("Error: Number of classes must be an integer between 1 and 8 (inclusive).");
            return false;
        }

        // Rule d
        if (!StudentNum.matches("\\d{2}[a-zA-Z]{2}\\d+")) {
            System.out.println("Error: Invalid student number format.");
            return false;
        }

        return true;
    }
    // determines classs numbers // 
    private static String determineWorkload(int ClassNum) {
        if (ClassNum == 1) {
            return "Very Light";
        } else if (ClassNum == 2) {
            return "Light";
        } else if (ClassNum >= 3 && ClassNum <= 5) {
            return "Part Time";
        } else {
            return "Full Time";
        }
    }

    private static void writeToStatustxt(String StudentNum, String Lastname, String workload) {
        try (FileWriter writer = new FileWriter("status.txt", true)) {
            
            writer.write(StudentNum + " - " + Lastname + "\n" + workload + "\n\n");
        } catch (IOException e) {
        }
    }
}