/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Hamid
 */
public class DisplayAllFileName {

    public static void main(String[] args) {

        Path location = Paths.get("F:/a/b/c/d");
        int count=0;
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(location); 
            
            for (Path file : stream) {
              count++;
                //System.out.println("Total file no : "+count);
                System.out.println(file.getFileName());
                
            }
            System.out.println("Total file no : "+count);
        } catch (IOException | DirectoryIteratorException x) {
         
            System.err.println(x);
        }

    }

}
