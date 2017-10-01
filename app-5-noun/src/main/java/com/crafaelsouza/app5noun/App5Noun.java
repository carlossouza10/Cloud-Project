package com.crafaelsouza.app5noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class App5Noun {

	public static void main(String[] args) {
		SpringApplication.run(App5Noun.class, args);
	}
}
