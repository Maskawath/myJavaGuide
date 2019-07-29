/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Hamid
 */
public class TemporaryfileAnddirectory {

    public static void main(String[] args) throws Exception {

        Path rootDirectory = FileSystems.getDefault().getPath("C:/home/docs");

        Path tempDirectory = Files.createTempDirectory(rootDirectory, "abc");
        System.out.println("Temporary directory created successfully!");
        
        String dirPath = tempDirectory.toString();
        System.out.println(dirPath);
        Path tempFile = Files.createTempFile(tempDirectory, "a", "b");
        System.out.println("Temporary file created successfully!");
        
        String filePath = tempFile.toString();
        System.out.println(filePath);
    }
}
