package com.promptly.backend.services;

import com.promptly.backend.database.schemas.User;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promptly.backend.database.repositories.UserRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    public void createUser(User user) {
        this.userRepository.insert(user);
    }

    public User getUser(String id) {
        return this.userRepository.findById(id).orElse(null);
    }

    public void updateUser(String id, User user) {
        User existingUser = this.userRepository.findById(id).orElse(null);
        if (existingUser == null) {
            return;
        }
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        this.userRepository.save(existingUser);
    }

    public void deleteUser(String id) {
        this.userRepository.deleteById(id);
    }
    
}
