package com.nttdata.bootcamp.app.respository;

public class Person {
	// Nombre de la persona
	private String firstname;
	// Apellidos de la persona
	private String lastname;
	// Edad de la persona
	private Integer age;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
