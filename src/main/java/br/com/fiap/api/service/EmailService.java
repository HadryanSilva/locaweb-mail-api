package br.com.fiap.api.service;

import br.com.fiap.api.mapper.EmailMapper;
import br.com.fiap.api.mapper.request.EmailRequest;
import br.com.fiap.api.mapper.response.EmailResponse;
import br.com.fiap.api.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class EmailService {

    private final EmailRepository repository;

    private final EmailMapper emailMapper;

    public EmailResponse saveEmail(EmailRequest request) {
        log.info("Saving email: {}", request);
        var email = emailMapper.postToEmail(request);
        var userSaved = repository.save(email);
        return emailMapper.toEmailResponse(userSaved);
    }

    public EmailResponse findEmailById(String id) {
        log.info("Getting email by id: {}", id);
        var email = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Email not found"));
        return emailMapper.toEmailResponse(email);
    }

    public List<EmailResponse> findAllEmailsByUserId(String userId) {
        log.info("Getting all emails by user id: {}", userId);
        return repository.findAllByUserId(userId)
                .stream()
                .map(emailMapper::toEmailResponse)
                .toList();
    }

}
