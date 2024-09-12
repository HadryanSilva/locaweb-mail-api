package br.com.fiap.api.mapper;

import br.com.fiap.api.mapper.request.EmailRequest;
import br.com.fiap.api.mapper.response.EmailResponse;
import br.com.fiap.api.model.Email;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmailMapper {

    Email postToEmail(EmailRequest emailRequest);

    EmailResponse toEmailResponse(Email email);

}
