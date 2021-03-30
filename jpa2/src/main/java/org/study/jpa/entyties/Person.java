package org.study.jpa.entyties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="person_hibernate_2")
@NamedQuery(name="find_all_persons", query="select p from Person p")

public class Person {

	@Id
	@GeneratedValue
	private int id;

	@Column(name="person_name")
	private String name;
	
	@Column(name="person_location")
	private String location;
	
	@Column(name="person_BD")
	private String birthDate;
	
	
	
	public Person() {
	}

	public Person(String name, String location, String birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public Person(int id, String name, String location, String birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]\n";
	}

	
	
	
}
