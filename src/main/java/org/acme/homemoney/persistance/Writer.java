package org.acme.homemoney.persistance;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public boolean writeNewQuickEntry(String entry) {
        String filename= "./src/main/resources/data/quickentry.cvs";
        FileWriter fw = null; //the true will append the new data
        try {
            fw = new FileWriter(filename,true);
            fw.write("\n");
            System.out.println(fw);
            fw.write(entry);//appends the string to the file
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
