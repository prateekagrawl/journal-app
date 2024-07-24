package com.prateek.journalApp.service;

import com.prateek.journalApp.entity.JournalEntry;
import com.prateek.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }
    public List<JournalEntry> getAllEntries() {
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> getEntryById(ObjectId objectId) {
        return journalEntryRepository.findById(objectId);
    }

    public void deleteEntryById(ObjectId objectId) {
        journalEntryRepository.deleteById(objectId);
    }
}
