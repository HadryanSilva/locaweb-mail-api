package br.com.fiap.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_settings")
public class UserConfig {

    private String id;

    private String userId;

}
