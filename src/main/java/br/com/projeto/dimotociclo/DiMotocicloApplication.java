package br.com.projeto.dimotociclo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "br.com.projeto.dimotociclo.adapters.integration.jpa.entity")
public class DiMotocicloApplication {

  public static void main(String[] args) {
    SpringApplication.run(DiMotocicloApplication.class, args);
  }
}
