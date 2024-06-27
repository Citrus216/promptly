package com.promptly.backend.controllers;

import com.promptly.backend.database.schemas.User;
import java.util.Collections;
import java.util.List;

import com.promptly.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


  public final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/api/v1/users")
  public List<User> getUsers() {
    return Collections.emptyList();
  }

  @PostMapping("/api/v1/users")
  public void createUser(@RequestBody User user) {

  }

  @GetMapping("/api/v1/users/{id}")
  public User getUser(@PathVariable String id) {
    return null;
  }

  @PatchMapping("/api/v1/users/{id}")
  public void updateUser(@PathVariable String id, @RequestBody User user) {

  }

  @DeleteMapping("/api/v1/users/{id}")
  public void deleteUser(@PathVariable String id) {

  }

}
