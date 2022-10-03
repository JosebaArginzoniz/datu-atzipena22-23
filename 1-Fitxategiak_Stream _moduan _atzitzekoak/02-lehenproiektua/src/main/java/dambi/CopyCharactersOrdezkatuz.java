/** Programa honek proiektuaren erroan dagoen Xanadu fitxategiaren 'a' letra irakurtzen dau, 
    * eta letra horren ordez 'o' idazten dau ordezkatu.txt fitxategian idatziz.   
    */

package dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersOrdezkatuz {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("ordezkatu.txt");

            int c;
            while ((c = inputStream.read()) != -1) {

                if (c == 97){
                    c = 111;
                }

                
            
                outputStream.write(c);
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
