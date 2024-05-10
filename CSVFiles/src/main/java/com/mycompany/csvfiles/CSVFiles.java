

package com.mycompany.csvfiles;

import com.mycompany.csvfiles.manageFile.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CSVFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("./data.csv");
        File file1 = new File("./data.csv");
        ReadFile readfile = new ReadFile(file);
        FileWriter writer = new FileWriter(file1);
        List<String> data = readfile.loadData();
        PrintWriter pw = new PrintWriter(file1);
        
        
        for (String line: data) {
            String[] splited = new String[3];
            splited = line.split(";");
            System.out.println("Hola " + splited[1] + " "+splited[2] + " tu codigo es: " + splited[0] );
            
        }
        
    }
}
