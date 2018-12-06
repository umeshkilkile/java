package com_32.aggregate_operations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	int salary;
	
	public Person(String name, LocalDate birthday, Sex gender, String emailAddress, int salary) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public static List<Person> createRoster(){
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Umesh", LocalDate.of(1987, 12, 18), Sex.MALE, "umesh.snk@gmail.com", 1000));
		list.add(new Person("Jeevan", LocalDate.of(1947, 12, 18), Sex.MALE, "jeevan@gmail.com", 2000));
		list.add(new Person("Jagadish", LocalDate.of(1895, 12, 18), Sex.MALE, "jaggu@gmail.com", 2500));
		list.add(new Person("Tamanna", LocalDate.of(1985, 12, 18), Sex.FEMALE, "tamanna@gmail.com", 3000));
		list.add(new Person("Ileana", LocalDate.of(1990, 12, 18), Sex.FEMALE, "ileana@gmail.com",2300));

		return list;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name : " + name);
		sb.append(" , BirthDay : " + birthday);
		sb.append(" , Gender : " + gender);
		sb.append(" , Email : " + emailAddress);
		sb.append(" , Salary : " + salary);
		return sb.toString();
	}

	public void printPerson() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name : " + name);
		sb.append(" , BirthDay : " + birthday);
		sb.append(" , Gender : " + gender);
		sb.append(" , Email : " + emailAddress);
		sb.append(" , Salary : " + salary);
		System.out.println(sb);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
