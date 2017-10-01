package com.crafaelsouza.app3article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class App3Article {

	public static void main(String[] args) {
		SpringApplication.run(App3Article.class, args);
	}
}
