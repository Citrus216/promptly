package com.promptly.backend.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.promptly.backend.database.schemas.Response;

public interface ResponseRepository extends MongoRepository<Response, String>{
    // TODO Implement ResponseRepository methods
}
