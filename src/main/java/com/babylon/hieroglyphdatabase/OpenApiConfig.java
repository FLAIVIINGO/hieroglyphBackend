package com.babylon.hieroglyphdatabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	@Bean
	public OpenAPI hieroglyphDatabaseOpenAPI() {
		return new OpenAPI().
		info(new Info().
		title("Hieroglyph REST API").
		description("My hieroglyph stock").
		version("1.0"));
	}
}
