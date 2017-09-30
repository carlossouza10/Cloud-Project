package com.crafaelsouza.app1article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class App1Article {

	public static void main(String[] args) {
		SpringApplication.run(App1Article.class, args);
	}
}
