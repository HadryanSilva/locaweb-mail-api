package br.com.fiap.api.controller;

import br.com.fiap.api.service.UserConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user-config")
public class UserConfigController {

    private final UserConfigService userConfigService;

}
