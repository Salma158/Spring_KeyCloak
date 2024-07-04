package com.example.auth2.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity serverHTTPSecurity){
        serverHTTPSecurity.authorizeExchange( exchangs -> exchangs.pathMatchers(HttpMethod.GET).permitAll()
                .pathMatchers("/items").authenticated()).oauth2ResourceServer(oAuth2ResourceServerSpec -> oAuth2ResourceServerSpec.jwt(Customizer.withDefaults()));
        serverHTTPSecurity.csrf(csrfSpec -> csrfSpec.disable());
        return serverHTTPSecurity.build();
    }
}