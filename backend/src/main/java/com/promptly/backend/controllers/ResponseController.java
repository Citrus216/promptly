package com.promptly.backend.controllers;

import com.promptly.backend.database.schemas.Response;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

  @PostMapping("/api/v1/responses")
  public void createResponse(@RequestBody Response response) {

  }

  @GetMapping("/api/v1/responses/{id}")
  public Response getResponse(@PathVariable String id) {
    return null;
  }

  @PatchMapping("/api/v1/responses/{id}")
  public void updateResponse(@PathVariable String id, @RequestBody Response response) {

  }

  @DeleteMapping("/api/v1/responses/{id}")
  public void deleteResponse(@PathVariable String id) {

  }

}
