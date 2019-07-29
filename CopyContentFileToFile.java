
package java_io;


import java.io.*;

public class CopyContentFileToFile {

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("F:/a/b/c/d/input.txt");
            out = new FileWriter("F:/a/b/c/d/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
