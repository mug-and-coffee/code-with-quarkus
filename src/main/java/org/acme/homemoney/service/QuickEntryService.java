package org.acme.homemoney.service;

import org.acme.homemoney.model.QuickEntry;
import org.acme.homemoney.persistance.CVS;
import org.acme.homemoney.persistance.Reader;
import org.acme.homemoney.persistance.Writer;

import java.time.LocalDate;
import java.util.List;

public class QuickEntryService {

    public static QuickEntry getById(Long id, List<QuickEntry> all) {
        System.out.println("[- - - QuickEntryService(getById) - - -]");
        return all.stream().filter(obj -> obj.getId().equals(id)).findFirst().get();
    }

    public static int getAmount(List<String> entries) {
        return entries.size();
    }

    /**
     * This method reads all QuickEntrys
     *
     * @return
     */
    public static List<QuickEntry> getAll(){
        return null;
    }

    /**
     * This method searches all QuickEntries by one date
     *
     * @param date
     * @return
     */
    public static List<QuickEntry> getByDate(LocalDate date) {
        return null;
    }

    /**
     * This method searches all QuickEntries by date range
     *
     * @param from
     * @param to
     * @return
     */
    public static List<QuickEntry> getByDateRange(LocalDate from, LocalDate to) {
        return null;
    }

    /**
     * Add a new QuickEntry
     *
     * @param entry
     * @return
     */
    public static boolean addQuickEntry(QuickEntry entry) {
        int newId = new Reader().getQuickEntriesAsStringList().size()+1;
        String newEntry = CVS.toString(entry, newId);
        return new Writer().writeNewQuickEntry(newEntry);
    }

    /**
     * Updating an exsisting QuickEntry
     *
     * @param entry
     * @return
     */
    public static boolean updateQuickEntry(QuickEntry entry) {
        return true;
    }

    /**
     * Removing a QuickEntry by ID
     *
     * @param id
     * @return
     */
    public static boolean removeQuickEntry(Long id) {
        return true;
    }
}
