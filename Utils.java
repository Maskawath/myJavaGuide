/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;

/**
 *
 * @author Hamid
 */
public class Utils {

    public static void main(String[] args) {
        final String FOLDER = "C:/tutorial";

        File folder = new File(FOLDER);

        removemdirectory(folder);
    }

    public static void removemdirectory(final File folder) {
        // check if folder file is a real folder
        if (folder.isDirectory()) {
            File[] list = folder.listFiles();
            if (list != null) {
                for (int i = 0; i < list.length; i++) {
                    File tmpF = list[i];
                    if (tmpF.isDirectory()) {
                        removemdirectory(tmpF);
                    }
                    tmpF.delete();
                    System.out.println("deleted folder : " + folder);
                }
            }
            if (!folder.delete()) {
                System.out.println("can't delete folder : " + folder);
            }
        }
    }
}
