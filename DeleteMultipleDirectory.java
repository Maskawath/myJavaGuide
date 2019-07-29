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
//Problem
public class DeleteMultipleDirectory {

    public static void main(String[] args) {
        File dir = new File("C:/tutorial");

        if (dir.isDirectory() == false) {
            System.out.println("Not a directory. Do nothing");
            return;
        }
        else{
        File[] listFiles = dir.listFiles();
        for (File file : listFiles) {
            System.out.println("Deleting file name is " + file.getName());
            file.delete();

        }
        }
        //now directory is empty, so we can delete it
        System.out.println("Deleting Directory. Success = " + dir.delete());

    }
}
