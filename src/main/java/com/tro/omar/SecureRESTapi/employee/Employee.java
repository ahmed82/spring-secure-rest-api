package com.tro.omar.SecureRESTapi.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@NotBlank
	private String name;
	private String description;
	
	public Employee() {
		super();
	}

	public Employee(@JsonProperty("id") String id, 
			@JsonProperty("name") String name,
			@JsonProperty("description") String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptioin() {
		return description;
	}

	public void setDescriptioin(String description) {
		this.description = description;
	}
	
	

}
