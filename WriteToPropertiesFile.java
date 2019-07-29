/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Hamid
 */
public class WriteToPropertiesFile {

    public static void main(String[] args) {

        Properties prop = new Properties();
        FileWriter output = null;

        try {

            output = new FileWriter("config.properties");

            // set the properties value
            prop.setProperty("database", "mysql");
            prop.setProperty("dbuser", "admin");
            prop.setProperty("dbpassword", "password");

            // save properties to project root folder
            prop.store(output, null);
   

       } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
