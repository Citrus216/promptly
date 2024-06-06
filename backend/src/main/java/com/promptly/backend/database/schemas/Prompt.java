package com.promptly.backend.database.schemas;

import java.util.Date;

@Document(collection = "prompts")
public class Prompt {
    @Id
    private String id;
    private Date dateCreated;
    private String promptString;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
