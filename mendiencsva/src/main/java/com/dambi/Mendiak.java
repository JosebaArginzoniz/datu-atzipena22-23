package com.dambi;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.*;  

public class Mendiak {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("               MENDIAK              ");
            System.out.println("====================================");
            System.out.println("1. Mendien zerrenda ikusi");
            System.out.println("2. Mendirik altuena bistaratu");
            System.out.println("3. Mendiak esportatu ");
            System.out.println("4.- ...");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();

            switch (aukera) {
                case 1:
                    mendiakIkusi();
                    break;
                case 2:
                    mendirikAltuenaBistaratu();
                    break;
                case 3:
                    mendiakEsportatu();
                    break;
                case 4:
                ();
                break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
    }





    public static void mendiakIkusi() throws Exception  
    {  
        //parsing a CSV file into Scanner class constructor  
        Scanner sc = new Scanner(new File("Mendiak.csv"));  
        sc.useDelimiter(",");   //sets the delimiter pattern  
        while (sc.hasNext())  //returns a boolean value  
        {  
        System.out.print(sc.next());  //find and returns the next complete token from this scanner  
        }   
        sc.close();  //closes the scanner  
    }  
}  
        