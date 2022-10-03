package dambi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Path_Sortu_Folder_And_File {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int aukera =0;
    do {
      System.out.println();
      System.out.println("             FOLDERS/FILES AUKERATKETA            ");
      System.out.println("==================================================");
      System.out.println("1. Mendien zerrenda ikusi");
      System.out.println("2. Mendirik altuena bistaratu");
      System.out.println("3.- Irten");
      System.out.println("");
      System.out.print("Aukeratu zenbaki bat: ");
      aukera = in.nextInt();

      switch (aukera) {
        case 1:
          foderBatGehitu();
          break;
        case 2:
          fileBatGehitu();
          break;
        case 3:
          System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
          break;
          default:
          System.out.println("Aukera okerra. Saiatu berriz.");
      }
    } while (aukera != 3);
      in.next();
  }


        try {
          
  
          String filename = "secondFile.txt";
          Path path = Paths.get("D:/2022-2023/DatuAtzipena/1-Fitxategiak_Stream _moduan _atzitzekoak/04-fileio/fileio/karpeta_berriak/animaliak/ugaztunak/kk/kk2");              
          //****************//
              
          String absoluteFilePath = "";
              
          //absoluteFilePath = workingDirectory + System.getProperty("file.separator") + filename;
          absoluteFilePath = path + File.separator + filename;
  
          System.out.println("Final filepath : " + absoluteFilePath);
              
          //****************//
              
          File file = new File(absoluteFilePath);
  
          if (file.createNewFile()) {
              System.out.println("File is created!");
          } else {
              System.out.println("File is already existed!");
          }
  
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  
}