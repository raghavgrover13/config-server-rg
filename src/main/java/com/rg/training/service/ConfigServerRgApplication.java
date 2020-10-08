package com.rg.training.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerRgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerRgApplication.class, args);
	}

}
