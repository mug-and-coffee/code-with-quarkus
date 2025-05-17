package org.acme.homemoney.persistance;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader {

    /**
     * Read file and get all lines
     *
     * @return
     */
    public List<String> readFile() {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream data = classloader.getResourceAsStream("data/quickentry.cvs");
        int c;
        StringBuffer buff = new StringBuffer();
        try {
            while ((c = data.read()) != -1) {
                buff.append((char) c);
            }
            data.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>(Arrays.asList(buff.toString().split("\\n")));
    }

}
