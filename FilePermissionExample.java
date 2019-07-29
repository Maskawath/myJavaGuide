/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.*;
import java.security.PermissionCollection;

/**
 *
 * @author Hamid
 */
public class FilePermissionExample {

    public static void main(String[] args) throws IOException {
        String source = "C:\\IOPackage\\java.txt";
        FilePermission file1 = new FilePermission("C:\\IOPackage\\-", "read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
        FilePermission file2 = new FilePermission(source, "write");
        permission.add(file2);
        
        if (permission.implies(new FilePermission(source, "read,write"))) {
            System.out.println("Read, Write permission is granted for the path " + source);
        } else {
            System.out.println("No Read, Write permission is granted for the path " + source);
        }

    }
}
