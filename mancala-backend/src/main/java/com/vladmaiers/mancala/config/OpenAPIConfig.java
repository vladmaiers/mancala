package com.vladmaiers.mancala.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAPI docs
 */
@Configuration
public class OpenAPIConfig {

    private static final String API_VERSION = "1.0";

    @Value("${spring.application.name}")
    private String title;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url("/"))
                .info(new Info().title(title).version(API_VERSION));
    }

}
