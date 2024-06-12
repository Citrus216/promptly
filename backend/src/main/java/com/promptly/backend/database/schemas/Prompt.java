package com.promptly.backend.database.schemas;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prompts")
public class Prompt {
    @Id
    private String id;
    private Date dateCreated;
    private String promptString;
    
    public Prompt() {
        this.dateCreated = new Date();
    }

    public Prompt(String promptString) {
        this.promptString = promptString;
        this.dateCreated = new Date();
    }
    
    // Getters and Setters
    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPromptString() {
        return promptString;
    }

    public void setPromptString(String promptString) {
        this.promptString = promptString;
    }
}
