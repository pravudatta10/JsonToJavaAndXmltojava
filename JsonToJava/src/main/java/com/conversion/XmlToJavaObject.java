package com.conversion;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlToJavaObject {

	public static void main(String[] args) throws JAXBException {
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

		// Now we will Convert this Employee Object To xml using JaxB API , If we are
		// using java 1.8 then no need to add ant dependecy , if higher then add jaxB
		// Api .

		// To convert javaObject to xml called Marshalling.
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		StringWriter writer = new StringWriter();
		marshaller.marshal(marshaller, writer);
		String xmlString = writer.toString();
		System.out.println(xmlString);

	}

}
