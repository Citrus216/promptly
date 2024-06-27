package com.promptly.backend.services;

import com.promptly.backend.database.schemas.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promptly.backend.database.repositories.ResponseRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ResponseService {

    private final ResponseRepository responseRepository;

    @Autowired
    public ResponseService(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    public void createResponse(Response response) {
        this.responseRepository.insert(response);
    }

    public Response getResponse(String id) {
        return this.responseRepository.findById(id).orElse(null);
    }

    public void updateResponse(String id, Response response) {
        Response existingResponse = this.responseRepository.findById(id).orElse(null);
        if (existingResponse == null) {
            return;
        }
        existingResponse.setResponseString(response.getResponseString());
        this.responseRepository.save(existingResponse);
    }

    public void deleteResponse(String id) {
        this.responseRepository.deleteById(id);
    }
    
}
