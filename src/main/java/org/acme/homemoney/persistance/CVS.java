package org.acme.homemoney.persistance;

import org.acme.homemoney.model.QuickEntry;

public class CVS {

    public static String toString(QuickEntry entry, int id) {
        return id +
                "," +
                entry.getSubject() +
                "," +
                entry.getDate() +
                "," +
                entry.getRecipient() +
                "," +
                entry.getPrice();
    }
}
