package org.study.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.study.jpa.Repository.PersonJpaRepository;
import org.study.jpa.entyties.Person;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	// implements CommandLineRunner used to override the run method so when running
	// the program the code in run will execute

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// logger is used to print data in consol

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("All persons:\n");
		repository.findAll();

		System.out.println(repository.findById(1));	

		System.out.println("insert");
		repository.insert(new Person("sami", "jeddah", "12/01/2002"));
		repository.insert(new Person("ali", "uppsala", "19/02/2003"));
		repository.insert(new Person("hassan", "stockholm", "18/03/2001"));
		repository.insert(new Person("jamal", "makkah", "15/07/2019"));

		System.out.println("All persons after insert:\n");
		System.out.println(repository.findAll());

		System.out.println("Update user 3 :\n");
		repository.update(new Person(3, "Pieter", "Utrecht", "07/09/1999"));
		System.out.println("All persons after update:\n");
		System.out.println(repository.findAll());

		System.out.println("deleting number 3 :");
		repository.deleteById(3);
		System.out.println("All persons after deleting 3 :\n");
		System.out.println(repository.findAll());
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * System.out.println("All persons:\n"); logger.info("All users -> {}",
	 * repository.findAll());
	 * 
	 * logger.info("User id 1 -> {}", repository.findById(1));
	 * 
	 * System.out.println("insert"); logger.info("Inserting -> {}",
	 * repository.insert(new Person("sami", "jeddah", "12/01/2002")));
	 * logger.info("Inserting -> {}", repository.insert(new Person("ali", "uppsala",
	 * "19/02/2003"))); logger.info("Inserting -> {}", repository.insert(new
	 * Person("hassan", "stockholm", "18/03/2001"))); logger.info("Inserting -> {}",
	 * repository.insert(new Person("jamal", "makkah", "15/07/2019")));
	 * 
	 * System.out.println("All persons after insert:\n");
	 * logger.info("All users -> {}", repository.findAll());
	 * 
	 * System.out.println("Update user 3 :\n"); logger.info("Update 3 -> {}",
	 * repository.update(new Person(3, "Pieter", "Utrecht", "07/09/1999")));
	 * System.out.println("All persons after update:\n");
	 * logger.info("All users -> {}", repository.findAll());
	 * 
	 * System.out.println("deleting number 2 :"); repository.deleteById(2);
	 * System.out.println("All persons after deleting 2 :\n");
	 * logger.info("All users -> {}", repository.findAll()); }
	 */

}
