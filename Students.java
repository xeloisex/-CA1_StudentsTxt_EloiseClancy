/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students.txt.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author clanc
 */
class Students {
     
    public static boolean Firstname(String Firstname) {
        return Firstname.matches("[a-zA-Z]+");
    }

    public static boolean Lastname(String Lastname) {
        return Lastname.matches("[a-zA-Z0-9]+\\s*[a-zA-Z0-9]*");
    }

    public static boolean ClassNum(String ClassNum) {
        try {
            int count = Integer.parseInt(ClassNum);
            return count >= 1 && count <= 8;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean StudentNum(String StudentNum) {
        return StudentNum.matches("\\d{2}[a-zA-Z]{2}\\d+");
    }

    public static boolean validateStudentData(String[] data) {
        if (data.length != 4) {
            return false;
        }
    
    String Firstname = data[0];
    String Lastname = data[1];
    String ClassNum = data[2];
    String StudentNum =data[3];
    
    
        return Firstname(Firstname) &&
                Lastname(Lastname) &&
                ClassNum(ClassNum) &&
                StudentNum(StudentNum);
    }

    /**
     *
     * @param args
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {    
        String filePath = "file2"; // File attached here //

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] studentData = line.split(",");
                if (validateStudentData(studentData)) {
                    System.out.println("Valid data: " + line);
                } else {
                    System.out.println("Invalid data: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            
        }
    }
}

