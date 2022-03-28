package br.com.projeto.dimotociclo.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean(name = "swagger")
   Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
            .apis(RequestHandlerSelectors.basePackage("br.com.projeto.dimotociclo.adapters.controllers"))
            .paths(PathSelectors.ant("/**"))
        .build()
        .groupName("Groupo di-motociclo APIs");
  }
}
