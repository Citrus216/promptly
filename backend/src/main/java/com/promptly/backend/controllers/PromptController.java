package com.promptly.backend.controllers;

import com.promptly.backend.database.repositories.PromptRepository;
import com.promptly.backend.database.schemas.Prompt;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromptController {

  //TODO autowire PromptService

  @GetMapping("/api/v1/prompts")
  public List<Prompt> getPrompts() {
    return Collections.emptyList();
  }

  @PostMapping("/api/v1/prompts")
  public void createPrompt(@RequestBody Prompt prompt) {

  }

  @GetMapping("/api/v1/prompts/{id}")
  public Prompt getPrompt(@PathVariable String id) {
    return null;
  }

  @PatchMapping("/api/v1/prompts/{id}")
  public void updatePrompt(@PathVariable String id, @RequestBody Prompt prompt) {

  }

  @DeleteMapping("/api/v1/prompts/{id}")
  public void deletePrompt(@PathVariable String id) {

  }

}
