package org.acme.homemoney.persistance;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    /**
     * Method to write a new QuickEntry
     *
     * @param entry
     * @return
     */
    public boolean writeNewQuickEntry(String entry) {
        String filename= "./src/main/resources/data/quickentry.cvs";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename,true);
            fw.write("\n");
            fw.write(entry);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
