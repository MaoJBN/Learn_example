
package com.mycompany.csvfiles.manageFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteFile {
    private File file1;
    private FileWriter writer;
    private PrintWriter pw;
    public WriteFile(File file1) throws IOException {
        this.file1 = file1;
        this.writer = new FileWriter(file1);
        this.pw = new PrintWriter(file1);
    }

    public void WriteF() throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(file1);
    }
    
}
