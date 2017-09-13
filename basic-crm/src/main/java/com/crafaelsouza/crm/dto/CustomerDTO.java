package com.crafaelsouza.crm.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class CustomerDTO {

	private Integer id;
	
    private String firstName;

    private String lastName;
	
	private String phone;
	
	private String email;
	
	private String address;
	
}
