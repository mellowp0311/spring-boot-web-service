package com.mellowp.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringWebServiceApplication {

    // TODO: @EnableJpaAuditing -> JPA Auditing 활성화

    public static void main(String[] args) {
        SpringApplication.run(SpringWebServiceApplication.class, args);
    }

}
