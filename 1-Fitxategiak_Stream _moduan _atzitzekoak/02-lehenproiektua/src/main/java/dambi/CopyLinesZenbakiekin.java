/** Programa honek proiektuaren erroan dagoen Xanadu fitxategiaren lerroak irakurtzen dauz, 
    * eta lerroak zenbaki batengatik aldatzen dau lineszenbakiekin.txt fitxategian idatziz.   
    */

package dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
 
public class CopyLinesZenbakiekin  {
    public static void main(String[] args) throws IOException {
 
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
 
        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("lineszenbakiekin.txt"));
 
            String l;
            int num=1;

            while ((l = inputStream.readLine()) != null) {
                
                outputStream.println(num);
                num = num + 1;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
