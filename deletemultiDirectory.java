/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Hamid
 */
public class deletemultiDirectory {

    public static void main(String[] args) {

        //Path path = FileSystems.getDefault().getPath("C:/tutorial/photos/hamid", "");
        File index = new File("C:/tutorial");
        //delete the  file

//        try {
//            Files.deleteIfExists(path);
//            System.out.println(path+ " deleted successfully");
//        } catch (IOException | SecurityException e) {
//            System.err.println(e);
//        }
//        
//        String[] entries = index.list();
//        for (String s : entries) {
//            File currentFile = new File(index.getPath(), s);
//            currentFile.delete();
//            System.out.println("deleted");
//            
//        }
       
    File[] files = index.listFiles();
    for (File file : files) {
        file.delete();
    }

    }
}
