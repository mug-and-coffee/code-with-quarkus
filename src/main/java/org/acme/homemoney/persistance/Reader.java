package org.acme.homemoney.persistance;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader {

    /**
     * Read file and get all lines
     *
     * @return
     */
    public List<String> readQuickEntry() {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream data = classloader.getResourceAsStream("data/quickentry.cvs");
        int c;
        StringBuilder buff = new StringBuilder();
        try {
            while (true) {
                assert data != null;
                if ((c = data.read()) == -1) break;
                buff.append((char) c);
            }
            data.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>(Arrays.asList(buff.toString().split("\\n")));
    }

}
