package com.promptly.backend.database.schemas;

@Document(collection = "prompts")
public class Prompt {
    @Id
    String promString;

    // Getters and Setters
}
