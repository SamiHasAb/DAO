package org.study.jdbc.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.study.jdbc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class PersonJbdcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id=?", new Object[] { id });
	}

	public int insert(Person person) {
		return jdbcTemplate.update("insert into person (id, name, location, birthDate) " + "values(?,  ?, ?, ?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						person.getBirthDate() });
	}
	//UPDATE `project_person`.`person` SET `name` = 'ss', `location` = 'we', `birthDate` = 'rrr' WHERE (`id` = '4');

	public int update(Person person) {
		return jdbcTemplate.update("update person " + " set name = ?, location = ?, birthDate = ? " + " where id = ?",
				new Object[] { person.getName(), person.getLocation(), person.getBirthDate() , person.getId()});
	}


}
