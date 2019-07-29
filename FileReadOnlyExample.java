/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Hamid
 */
public class FileReadOnlyExample {

    public static void main(String[] args) throws IOException {

        File myfile = new File("F:/a/b/c/d/Myfile.txt");

        // for readonly
        myfile.setReadOnly();

        if (myfile.canWrite()) {
            System.out.println("This file is writable");
        } else {
            System.out.println("This file is read only");
        }

        //for writable
        myfile.setWritable(true);
        if (myfile.canWrite()) {
            System.out.println("This file is writable");
        } else {
            System.out.println("This file is read only");
        }

        //for writing......
        String outputlocation = "F:/a/b/c/d/Myfile.txt";
        try {
            PrintWriter writer = new PrintWriter(outputlocation);
            writer.println("Hello friends");
            writer.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
