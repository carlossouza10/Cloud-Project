package com.crafaelsouza.app6sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class App6Sentence {

	public static void main(String[] args) {
		SpringApplication.run(App6Sentence.class, args);
	}
}
