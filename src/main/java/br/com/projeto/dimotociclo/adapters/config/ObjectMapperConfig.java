package br.com.projeto.dimotociclo.adapters.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;

@Configuration
public class ObjectMapperConfig {

  @Bean
  public ObjectMapper getJacksonObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.findAndRegisterModules();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.configure(WRITE_DATES_AS_TIMESTAMPS, false);
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    return objectMapper;
  }
}
