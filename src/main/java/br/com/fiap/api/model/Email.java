package br.com.fiap.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "emails")
public class Email {

    private String id;

    private String userId;

}
