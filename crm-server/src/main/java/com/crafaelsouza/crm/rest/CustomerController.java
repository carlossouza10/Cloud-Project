package com.crafaelsouza.crm.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

	@Value("${parameters.teste}")
	private String teste;
	
	@Value("${eureka.client.serviceUrl.defaultZone}")
	private String defaultZone;
	
//	@GetMapping
//	public List<CustomerDTO> findAll() {
//		CustomerDTO customer = new CustomerDTO();
//		customer.setFirstName(teste);
//		customer.setEmail("joseph@teste.com");
//		customer.setPhone("2131232");
//		
//		return Arrays.asList(customer);
//	}
	
	@GetMapping
	public String findAll() {
		return defaultZone;
	}
}
