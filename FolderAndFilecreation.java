/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hamid
 */
public class FolderAndFilecreation {

    public static void main(String args[]) throws IOException {
        Scanner reader = new Scanner(System.in);

        boolean success = false;

        System.out.println("Enter path of directory to create");
        String dir = reader.nextLine(); // Creating new directory in Java, if it doesn't exists 
        File directory = new File(dir);

        if (directory.exists()) {
            System.out.println("Directory already exists ...");
        } else {
            System.out.println("Directory not exists, creating now");
            success = directory.mkdirs();
            if (success) {
                System.out.println("Successfully created new directory : " +dir);
            } else {
                System.out.println("Failed to create new directory: "+dir);
            }
        } // Creating new file in Java, only if not exists

        System.out.println("Enter file name to be created ");
        String filename = reader.nextLine();
        File f = new File(directory, filename);
        //success = f.createNewFile();

        if (f.exists()) {
            System.out.println("File already exists");
        } else {
            System.out.println("No such file exists, creating now");
            success = f.createNewFile();
            if (success) {
                System.out.printf("Successfully created new file: %s%n", f);
            } else {
                System.out.printf("Failed to create new file: %s%n", f);
            }
        }
// close Scanner to prevent resource leak 
        reader.close();

    }
}
