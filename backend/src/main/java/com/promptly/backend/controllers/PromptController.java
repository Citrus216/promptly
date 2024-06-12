package com.promptly.backend.controllers;

import com.promptly.backend.database.repositories.PromptRepository;
import com.promptly.backend.database.schemas.Prompt;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.promptly.backend.services.PromptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/prompts")
public class PromptController {

  private final PromptService promptService;

  @Autowired
  public PromptController(PromptService promptService) {
    this.promptService = promptService;
  }

  @GetMapping("/")
  public ResponseEntity<List<Prompt>> getPrompts() {
    try {
      return ResponseEntity.ok(this.promptService.getAll());
    } catch(Exception e) {
      return ResponseEntity.internalServerError().body(Collections.emptyList());
    }
  }

  @PostMapping("/")
  public ResponseEntity<Prompt> createPrompt(@RequestBody Prompt prompt) {
    try {
      return ResponseEntity.ok(this.promptService.create(prompt));
    } catch(Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  @GetMapping("/{id}")
  public ResponseEntity<Prompt> getPrompt(@PathVariable String id) {
    try {
      return ResponseEntity.ok(this.promptService.get(id));
    } catch(Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  @PatchMapping("/{id}")
  public ResponseEntity<Prompt> updatePrompt(@PathVariable String id, @RequestBody Prompt prompt) {
    try {
      return ResponseEntity.ok(this.promptService.update(id, prompt));
    } catch(Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Prompt> deletePrompt(@PathVariable String id) {
    try {
      return ResponseEntity.ok(this.promptService.delete(id));
    } catch(Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }

}
