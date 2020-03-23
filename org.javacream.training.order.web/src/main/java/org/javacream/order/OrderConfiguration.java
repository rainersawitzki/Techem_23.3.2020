package org.javacream.order;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("org.javacream")
public class OrderConfiguration {

	@Bean
	@Qualifier("store")
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	@Qualifier("booksService")
	public RestTemplate restTemplateForBooksService(RestTemplateBuilder builder) {
		return builder.build();
	}
}