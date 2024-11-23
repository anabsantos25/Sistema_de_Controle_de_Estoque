package Projeto.SCV.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permitir requisições de qualquer origem para o endpoint
        registry.addMapping("/**").allowedOrigins("http://localhost:63342"); // isso pode dar problema se for colocado em outro pc, então caso aconteça, substituir para  "/**"
    }
}



