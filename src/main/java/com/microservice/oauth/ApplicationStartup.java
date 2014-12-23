package com.microservice.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@EnableJpaRepositories
@EnableAutoConfiguration
public class ApplicationStartup
{
	public static void main(String[] args)
	{
		SpringApplication.run(ApplicationStartup.class, args);
	}
}
