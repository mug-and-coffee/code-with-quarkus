package org.acme.homemoney.persistance;

import org.acme.homemoney.model.QuickEntry;

public class CVS {

    /**
     * Create a string from a QuickEntry object with the given id
     *
     * @param entry
     * @param id
     * @return
     */
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
