/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students.txt.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clanc
 */
@SuppressWarnings("null")
public class inputTxt {
      // Add Scanner Class
    public inputTxt(){
      try {
            readFromFile("inputTxt");
            readFromFile("StudentsTxt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentsTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}