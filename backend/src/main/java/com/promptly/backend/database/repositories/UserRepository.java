package com.promptly.backend.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.promptly.backend.database.schemas.User;

public interface UserRepository extends MongoRepository<User, String> {

}
