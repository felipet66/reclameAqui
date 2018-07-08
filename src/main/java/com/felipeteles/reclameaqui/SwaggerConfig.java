package com.felipeteles.reclameaqui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)) // Apenas classes anotadas como @RestController
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("API REST - Application ReclameAqui")
                .description("Crud and consult ")
                .termsOfServiceUrl("https://github.com/felipet66")
                .contact(new Contact("Felipe Teles de Medeiros", "https://www.linkedin.com/in/felipeteles95/", "fliptm95@gmail.com"))
                .license("Licença")
                .licenseUrl("https://github.com/felipet66")
                .version("1.0.0-SNAPSHOT")
                .build();
    }
}