package dambi;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

    public class Path_Sortu {

        public static void main(String[] args) {
    
            try {
                Path path = Paths.get("D:/2022-2023/DatuAtzipena/1-Fitxategiak_Stream _moduan _atzitzekoak/04-fileio/fileio/karpeta_berriak/animaliak/ugaztunak/kk/kk2");

                Files.createDirectories(path);
    
                System.out.println("Directory is created!");
    
            } catch (IOException e) {
                System.err.println("Failed to create directory!" + e.getMessage());
            }
    
        }
    }



