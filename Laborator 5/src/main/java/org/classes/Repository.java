package org.classes;


import org.records.Document;
import org.records.Person;

import java.util.*;

import java.nio.file.Path;

public class Repository
{
    private Path directory;
    private Map<Person, List<Document>> documents = new HashMap<>();

    public Repository()
    {
        loadDocuments();
    }
    private void loadDocuments()
    {

    }

    public Map<Person, List<Document>> getDocuments() {
        return documents;
    }

    public void setDocuments(Map<Person, List<Document>> documents) {
        this.documents = documents;
    }

    public void putDocuments(Person person, Document document)
    {
        if(this.documents.get(person) == null)
        {
            this.documents.put(person, new ArrayList<>(Collections.singleton(document)));
        }
        else
        {
            this.documents.get(person).add(document);
        }
    }
    public Path getDirectory() {
        return directory;
    }

    public void setDirectory(Path directory) {
        this.directory = directory;
    }
}
