/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.Console;

/**
 *
 * @author Hamid
 */
public class ReadingFromConsole1 {

//    public static void main(String args[]) {
//        Console c = System.console();
//        System.out.println("Enter your name: ");
//        String name = c.readLine();
//        System.out.println("Welcome " + name);
//    }
    public static void main(String[] args) {      
      Console cnsl = null;
      String name = null;
      
      try {
         // creates a console object
         cnsl = System.console();

         // if console is not null
         if (cnsl != null) {
            
            // read line from the user input
            name = cnsl.readLine("Name: ");
            
            // prints
            System.out.println("Name entered : " + name);
         }     
         
      } catch(Exception ex) {
         // if any error occurs
         ex.printStackTrace();      
      }
   }

}
