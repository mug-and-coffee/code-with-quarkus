package org.acme.homemoney.persistance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    /**
     * Method to write a new QuickEntry
     *
     * @param entry
     */
    public boolean writeNewQuickEntry(String entry) {
        /*String filename= "./src/main/resources/data/quickentry.cvs";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename,true);
            fw.write(entry);
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("./src/main/resources/data/quickentry.cvs", true));
            writer.append("\n");
            writer.append(entry);

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
