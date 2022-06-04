package com.example.demo.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateClient {
	@Bean("clienteRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();

	}

}
