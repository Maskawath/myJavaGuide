/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hamid
 */
public class Folder_FileCreation {

    public static void main(String[] args) {
        File file = new File("C:/Library/library1/library2\\test.txt");
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }

}
