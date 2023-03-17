package dev.qing.JWTSecurity.Controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TokenService;
import org.springframework.security.core.Authentication;
//import java.util.logging.Logger;

@RestController
public class AuthController {
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

   @PostMapping("/token")
    public String token(Authentication authentication) {
        LOG.debug("Token for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token granted {}", token);
        return token;

    }
}
