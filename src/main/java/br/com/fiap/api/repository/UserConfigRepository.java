package br.com.fiap.api.repository;

import br.com.fiap.api.model.UserConfig;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserConfigRepository extends MongoRepository<UserConfig, String> {
}
