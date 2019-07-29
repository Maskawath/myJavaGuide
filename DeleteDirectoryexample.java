/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Hamid
 */
public class DeleteDirectoryexample {

    private static final String FOLDER = "C:/tutorial";

    public static void main(String[] args) throws IOException {

        File newFolder = new File(FOLDER);

        boolean directory = newFolder.delete();

        if (directory) {
            newFolder.delete();
            System.out.println("Folder was deleted !");

        }

    }
}