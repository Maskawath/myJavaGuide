/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.io.IOException;

//problem
public class DeleteDirectory
{
   private static final String folder = "C:/tutorial";

   public static void main(String[] args) throws IOException
   {
      File fl = new File(folder);
      if(!fl.exists()) // checking if directory exists
      {
         System.out.println("Sorry!! directory doesn't exist.");
      }
      else
      {
         DeleteDirectory dd = new DeleteDirectory();
         dd.deleteDirectory(fl);
      }
   }

   public void deleteDirectory(File file) throws IOException
   {
      if(file.isDirectory())
      {
         if(file.list().length == 0)
         { 
            deleteEmptyDirectory(file); // here if directory is empty delete we are deleting
         }
         else
         {
            File fe[] = file.listFiles();
            for(File deleteFile : fe)
            {
               deleteDirectory(deleteFile); // recursive call
            }
            if(file.list().length == 0)
            {
               deleteEmptyDirectory(file);
            }
         }
      }
      else
      {
         file.delete();
         System.out.println("File deleted : " + file.getAbsolutePath());
      }
   }

   private void deleteEmptyDirectory(File fi)
   {
      fi.delete();
      System.out.println("Directory deleted : " + fi.getAbsolutePath());
   }
}