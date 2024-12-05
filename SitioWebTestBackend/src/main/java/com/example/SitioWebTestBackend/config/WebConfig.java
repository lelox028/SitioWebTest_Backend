package com.example.SitioWebTestBackend.config; // ajusta el paquete según tu proyecto

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  // Esta anotación marca la clase como una clase de configuración de Spring
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Configura CORS para permitir peticiones desde el frontend
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")  // URL de tu frontend React
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
