package br.com.projeto.dimotociclo;

import br.com.projeto.dimotociclo.adapters.core.impl.LerXmlService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "br.com.projeto.dimotociclo.adapters.jpa.entity")
public class DiMotocicloApplication {

  public static void main(String[] args) {
    SpringApplication.run(DiMotocicloApplication.class, args);
    new LerXmlService().lerXml();
  }
}
