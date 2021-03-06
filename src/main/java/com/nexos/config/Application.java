package com.nexos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.nexos.*"})
@EnableJpaRepositories("com.nexos.mod.core.repositories")
@EntityScan("com.nexos.mod.core.entities")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

  }
}

