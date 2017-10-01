package com.crafaelsouza.app2verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class App2Verb {

	public static void main(String[] args) {
		SpringApplication.run(App2Verb.class, args);
	}
}
