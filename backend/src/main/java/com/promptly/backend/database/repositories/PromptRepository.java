package com.promptly.backend.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.promptly.backend.database.schemas.Prompt;

public interface PromptRepository extends MongoRepository<Prompt, String>{
    
}
