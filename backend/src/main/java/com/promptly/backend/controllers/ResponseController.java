package com.promptly.backend.controllers;

import com.promptly.backend.database.schemas.Response;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/responses")
public class ResponseController {

  @PostMapping("/")
  public void createResponse(@RequestBody Response response) {

  }

  @GetMapping("/{id}")
  public Response getResponse(@PathVariable String id) {
    return null;
  }

  @PatchMapping("/{id}")
  public void updateResponse(@PathVariable String id, @RequestBody Response response) {

  }

  @DeleteMapping("/{id}")
  public void deleteResponse(@PathVariable String id) {

  }

}
