/** Programa honek proiektuaren erroan dagoen Xanadu fitxategia bytez byte irakurtzen du, 
    * byte bakoitza outagain.txt fitxategian idatziz.
    */
    
package dambi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Closeable;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
 
        FileInputStream in = null;
        FileOutputStream out = null;
 
        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
 
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } 
    }
}