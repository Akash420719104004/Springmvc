package com.example.springRestApi.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    public OpenAPI openAPI()
    {
        return new OpenAPI();
    }

}
