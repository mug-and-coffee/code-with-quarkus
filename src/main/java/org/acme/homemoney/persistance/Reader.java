package org.acme.homemoney.persistance;

import org.acme.homemoney.model.QuickEntry;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reader {

    /**
     * Read file and get all lines
     *
     * @return
     */
    public List<String> getQuickEntriesAsStringList() {
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

        List<String> lines = new ArrayList<>(Arrays.asList(buff.toString().split("\\n")));
        return lines;
    }

    public List<QuickEntry> getQuickEntriesAsObjectList() {
        System.out.println("[- - - Reader(getQuickEntriesAsObjectList) - - -]");
        List<String> strList = getQuickEntriesAsStringList();
        System.out.println("************");
        System.out.println("Found lines: " + strList.size());
        strList.forEach(System.out::println);


        List<String> filtered = strList
                .stream()
                .filter(
                        line -> line.trim().length() > 1
                                && !line.startsWith("id")).toList();

        List<QuickEntry> objList = new ArrayList<>();

        filtered.forEach(strObj -> {
            if(!strObj.isBlank()){
                objList.add(CVS.toQuickEntry(strObj));
            }
        });

        System.out.println("+++++++++++++");
        System.out.println("Found lines: " + objList.size());
        objList.forEach(System.out::println);

        return objList;
    }

}
