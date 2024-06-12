package com.promptly.backend.services;

import com.promptly.backend.database.schemas.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promptly.backend.database.repositories.PromptRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PromptService {
    
    @Autowired
    private PromptRepository promptRepository;

    public List<Prompt> getAll() {
        return this.promptRepository.findAll();
    }

    public Prompt create(Prompt prompt) {
        return this.promptRepository.save(prompt);
    }

    public Prompt get(String id) {
        return this.promptRepository.findById(id).orElse(null);
    }

    public Prompt update(String id, Prompt prompt) {
        Prompt existingPrompt = this.promptRepository.findById(id).orElse(null);
        if (existingPrompt == null) {
            return null;
        }
        existingPrompt.setPromptString(prompt.getPromptString());
        this.promptRepository.save(existingPrompt);
        return existingPrompt;
    }

    public Prompt delete(String id) {
        Prompt prompt = this.promptRepository.findById(id).orElse(null);
        if (prompt == null) {
            return null;
        }
        this.promptRepository.deleteById(id);
        return prompt;
    }
    
}
