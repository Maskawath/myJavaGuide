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
public class DeleteFolderRecursively {

    public static void main(String[] args) {
        String folder = "C:/tutorial";
        //delete folder recursively
        recursiveDelete(new File(folder));
    }

    public static void recursiveDelete(File file) {
        //to end the recursive loop
        if (!file.exists()) {
            
            System.out.println("File :"+file+" is not exists!!!");
        }

        //if directory, go inside and call recursively
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                //call recursively
                recursiveDelete(f);
            }
        }
        //call delete to delete files and empty directory
        file.delete();
        System.out.println("Deleted file/folder: " + file.getAbsolutePath());
    }
}
