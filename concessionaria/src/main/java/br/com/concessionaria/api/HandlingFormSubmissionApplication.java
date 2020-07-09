package br.com.concessionaria.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("br.com.concessionaria.model")
@SpringBootApplication(scanBasePackages = {
		"br.com.concessionaria.api",
		"br.com.concessionaria.model",
		"br.com.concessionaria.repository",
		"br.com.concessionaria.service"
})
@EnableJpaRepositories("br.com.concessionaria.repository")
public class HandlingFormSubmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlingFormSubmissionApplication.class, args);
	}

}
