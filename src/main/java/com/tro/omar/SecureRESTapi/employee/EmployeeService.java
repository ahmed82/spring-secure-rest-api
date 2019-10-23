package com.tro.omar.SecureRESTapi.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	//@Qualifier("emprep")
	private EmployeeRepository employeeRepository;

	
	public List<Employee> getAllEmployees(){
		List<Employee> emps = new ArrayList<>();
		employeeRepository.findAll()
				.forEach(emps::add);
		  return emps;
	}

	public Optional<Employee> getEmployee(String id) {
		// return employees.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return employeeRepository.findById(id);

	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(String id) {
		//employees.removeIf(e -> e.getId().equals(id));
		employeeRepository.deleteById(id);
	}
}
