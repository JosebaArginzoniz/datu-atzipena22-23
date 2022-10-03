package dambi;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Path_Egiaztatu {
	
    public static void main( String[] args )
    {
        File archivo = new File("C://Users/arginzoniz.joseba/Pictures/Camera Roll");
        if (archivo.exists()) {
            if (archivo.isFile()) System.out.println("Es un archivo");
            if (archivo.isDirectory()) System.out.println("Es una carpeta");
        }
        else {
            System.out.println("OJO: ¡¡No existe el archivo de configuración!!");
        }
    }

}

/*https://www.campusmvp.es/recursos/post/java-como-comprobar-si-existe-o-no-un-archivo-o-una-carpeta-en-el-disco-duro.aspx*/

