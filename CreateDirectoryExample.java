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

public class CreateDirectoryExample {

    //private static final String FOLDER = "C:\\abc\\xyz\\hamid";
    private static final String FOLDER = "C:/tutorial/photos/hamid";

    public static void main(String[] args) throws IOException {

       File newFolder = new File(FOLDER);

        boolean created = newFolder.mkdirs();

        if (created) {

            System.out.println("Folder was created !");

        }
      
        // to bring how many directories are available
//        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
//        for (Path name : dirs) {
//            System.err.println(name);
//        }

    }

}
