package com.example.spring_boot_rest_postgree.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info (
        contact = @Contact(
            name = "integration-developer.de",
            email = "admin@integration-developer.de",
            url = "https://integration-developer.de/"
        ),
        description = "This API receives a JSON string, processes it and stores the data in a PostgreSQL database.",
        title = "OpenApi specification - Learnproject"
    )
)

public class OpenApiConfig {

}
