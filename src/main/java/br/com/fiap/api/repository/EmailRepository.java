package br.com.fiap.api.repository;

import br.com.fiap.api.model.Email;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends MongoRepository<Email, String> {

    List<Email> findAllByUserId(String userId);

}
