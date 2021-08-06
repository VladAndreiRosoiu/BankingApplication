package org.itss;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
// @EnableProcessApplication este necesar pentru a functiona form-urile custom
// este facuta conexiunea la o baza de date locala MYSQL -> configurarea se face in fisierul "application.yaml"
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

}