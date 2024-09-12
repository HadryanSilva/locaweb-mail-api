package br.com.fiap.api.controller;

import br.com.fiap.api.mapper.request.EmailRequest;
import br.com.fiap.api.mapper.response.EmailResponse;
import br.com.fiap.api.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<EmailResponse> save(@RequestBody EmailRequest request) {
        var emailResponse = emailService.saveEmail(request);
        return ResponseEntity.created(URI.create("/api/v1/email/")).body(emailResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmailResponse> findById(@PathVariable String id) {
        var emailResponse = emailService.findEmailById(id);
        return ResponseEntity.ok(emailResponse);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<EmailResponse>> findAllByUserId(@PathVariable String userId) {
        var emails = emailService.findAllEmailsByUserId(userId);
        return ResponseEntity.ok(emails);
    }

}
