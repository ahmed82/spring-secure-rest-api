package com.tro.omar.SecureRESTapi.employee;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	
	@Autowired
	private EmployeeService employeeService;
	
/*	@GetMapping
	public List<Employee> getAllManagers(){
		//throw new IllegalStateException("Oops cannot get all managers");
		 return employeeService.getAllEmployees();
	}*/
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		log.info(" ############ Get All Employee");
		log.debug(" ############ Debug");
		return employeeService.getAllEmployees();
	}
	 // findEmployee(@PathVariable("foo") String id){
	@RequestMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id){
			return employeeService.getEmployee(id);
	}
	
	//@RequestMapping(value="/employees",method=RequestMethod.POST )
	@PostMapping("/employees")
	public void addEmployee(@Valid @NotNull @RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.PUT)
	public void updateEmployee(@Valid @NotNull @RequestBody Employee employee, @PathVariable String id){
		employeeService.updateEmployee(id,employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{id}")
	public void deleteEmployee(@PathVariable String id){
			 employeeService.deleteEmployee(id);
	}

}
