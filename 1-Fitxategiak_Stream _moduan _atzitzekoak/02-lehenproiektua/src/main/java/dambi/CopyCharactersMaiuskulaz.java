/** Programa honek proiektuaren erroan dagoen Xanadu fitxategiaren letra minuskulak irakurtzen dauz, 
    * eta letra bakoitza maiuskulan jartzen dau maiuskula.txt fitxategian idatziz.   
    */

package dambi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersMaiuskulaz {
    
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("maiuskula.txt");

            int c;
                while ((c = inputStream.read()) != -1) {

                    if (c >= 96){
                        c =c-32;
                    }
                    outputStream.write(c);
                }

        }   finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
    }
    
}

