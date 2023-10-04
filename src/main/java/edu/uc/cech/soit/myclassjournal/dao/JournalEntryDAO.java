package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JournalEntryDAO implements IJournalEntryDAO {

    private final List<JournalEntry> journalEntries = new ArrayList<>();

    @Override
    public void save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}
