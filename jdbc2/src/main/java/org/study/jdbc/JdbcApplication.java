package org.study.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.study.jdbc.DAO.PersonJbdcDao;
import org.study.jdbc.entity.Person;

@SpringBootApplication
public class JdbcApplication implements CommandLineRunner {

	// implements CommandLineRunner used to override the run method so when running
	// the program the code in run will execute

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// logger is used to print data in consol

	@Autowired
	PersonJbdcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\nprint all users:\n");
		System.out.println(dao.findAll());

		System.out.println("find user 1:");
		System.out.println(dao.findById(1));

		System.out.println("Insert user 5 ");
		dao.insert(new Person(5, "Tara", "Berlin", "20/01/1980"));
		System.out.println("print all users:");
		System.out.println(dao.findAll());

		System.out.println("delete user 5 ");
		dao.deleteById(5);
		System.out.println("print all users:");
		System.out.println(dao.findAll());

		System.out.println("update user 4 ");
		dao.update(new Person(4, "Pieter", "Utrecht", "20/01/1980"));
		System.out.println("print all users:");
		System.out.println(dao.findAll());

	}

	// using logger to printout info in consol
	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * logger.info("All users -> {}", dao.findAll());
	 * 
	 * logger.info("User id 1 -> {}", dao.findById(1));
	 * 
	 * logger.info("Inserting 5-> {}", dao.insert(new Person(5, "Tara", "Berlin",
	 * "20/01/1980"))); logger.info("All users -> {}", dao.findAll());
	 * 
	 * logger.info("Deleting 5 -> No of Rows Deleted - {}", dao.deleteById(5));
	 * logger.info("All users -> {}", dao.findAll());
	 * 
	 * logger.info("Update 4 -> {}", dao.update(new Person(4, "Pieter", "Utrecht",
	 * "20/01/1980")));
	 * 
	 * }
	 */

}
