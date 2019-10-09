package com.tro.omar.SecureRESTapi.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	//getAllEmployees()

}
