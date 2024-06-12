
package com.promptly.backend.database.schemas;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "responses")
public class Response {
    @Id
    private String id;
    private Date dateCreated;
    private String userId;
    private String promptId;
    private String responseString;

    public Response() {
        this.dateCreated = new Date();
    }

    public Response(String userId, String promptId, String responseString) {
        this.userId = userId;
        this.promptId = promptId;
        this.responseString = responseString;
        this.dateCreated = new Date();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPromptId() {
        return promptId;
    }

    public void setPromptId(String promptId) {
        this.promptId = promptId;
    }

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseString) {
        this.responseString = responseString;
    }
}
