/** Programa honek proiektuaren erroan dagoen Xanadu fitxategiaren letrak, letraz letra irakurtzen dau, 
    * eta letra bakoitza lerro bakar baten idazten dau.   
    */

package dambi;

import java.io.*;
import java.util.Scanner; 

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

