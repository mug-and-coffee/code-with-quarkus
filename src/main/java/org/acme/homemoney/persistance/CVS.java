package org.acme.homemoney.persistance;

import org.acme.homemoney.model.QuickEntry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public static QuickEntry toQuickEntry(String strObj) {
        String[] parts = strObj.split(",");
        Long id = Long.valueOf(parts[0]);
        String subject = parts[1];
        Double price = Double.valueOf(parts[4]);
        String recipient = parts[3];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(parts[2], formatter);
        QuickEntry quickEntry = new QuickEntry(id, price, recipient, subject, date);
        return quickEntry;
    }
}
