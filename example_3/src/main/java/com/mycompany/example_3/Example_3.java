
package com.mycompany.example_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Example_3 {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        file.createNewFile();
        
        
        
//        FileWriter fileWrite = new FileWriter("./archivo1.txt");
//        
//        fileWrite.write("hola mi nombre es pedro");
//        fileWrite.close();
     
        FileReader ReadingFile = new FileReader(file);
        
//        es otra forma de imprimir el contenido del file
        
//        char data [] = new char[50];
//        ReadingFile.read(data);
//        System.out.println(data);
        
        BufferedReader buffer = new BufferedReader(ReadingFile);
        
        String line;
        while((line=buffer.readLine()) != null){
            System.out.println("Line: "+ line);
        }
        ReadingFile.close();
        
      }
    }
