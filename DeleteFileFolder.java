/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.util.Stack;

/**
 *
 * @author Hamid
 */
public class DeleteFileFolder {

    public static void main(String[] args) {
        File dir = new File("C:/tutorial");
        File[] fileList;
        Stack<File> stack = new Stack<File>();
        stack.push(dir);
        while (!stack.isEmpty()) {
            if (stack.lastElement().isDirectory()) {
                fileList = stack.lastElement().listFiles();
                if (fileList.length > 0) {
                    for (File file : fileList) {
                        stack.push(file);
                    }
                } else {
                    stack.pop().delete();
                }
            } else {
                stack.pop().delete();
            }
        }
    }
}
