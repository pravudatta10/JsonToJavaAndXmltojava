package com.conversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsontoJavaObject {

	public static void main(String[] args) throws JsonProcessingException {
		Address address = new Address();
		address.setVillage("Mirzapur");
		address.setPost("Lanka");
		address.setDist("Js Pur");
		address.setPinCode(754137);
		address.setState("Odisha");
		address.setNationality("Indian");

		Employee employee = new Employee();
		employee.setName("Pravudatta");
		employee.setAge(30);
		employee.setHeight(180.0f);
		employee.setDesignation("Senior Software Engineer");
		employee.setSalary(60000.0);
		employee.setStatus("Active");
		employee.setAddress(address);

		// Now We will Convert this java object Employee to json using jackson API .

		ObjectMapper javaTojson = new ObjectMapper();
		String value = javaTojson.writeValueAsString(employee);
		System.out.println(value);

		// OutPut
		/*
		 * { "name": "Pravudatta", "age": 30, "height": 180.0, "designation":
		 * "Senior Software Engineer", "salary": 60000.0, "status": "Active", "address":
		 * { "village": "Mirzapur", "post": "Lanka", "dist": "Js Pur", "pinCode":
		 * 754137, "state": "Odisha", "nationality": "Indian" } }
		 */

		// Now We will Convert this json String to Employee Object .

		ObjectMapper jsonToJava = new ObjectMapper();
		Employee employeeObject = jsonToJava.readValue(value, Employee.class);
		System.out.println(employeeObject);

		// OutPut
		// Employee [name=Pravudatta, age=30, height=180.0, designation=Senior Software
		// Engineer, salary=60000.0, status=Active,
		// address=com.conversion.Address@6d3af739]

	}

}
