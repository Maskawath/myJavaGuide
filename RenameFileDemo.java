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
public class RenameFileDemo {

    public static void main(String[] args) {
        //Old File
        File oldfile = new File("F:/a/b/c/d/hamid.txt");
        //New File
        File newfile = new File("F:/a/b/c/d/mynewfile1.txt");
        /*renameTo() return boolean value
         * It return true if rename operation is
         * successful
         */
        
        boolean flag = oldfile.renameTo(newfile);
        if (flag) {
            
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Rename operation failed");
        }
    }
    
}
