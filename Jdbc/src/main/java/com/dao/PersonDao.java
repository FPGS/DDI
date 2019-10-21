package com.dao;

import java.util.List;
import java.util.Optional;

import com.entities.Person;

public interface PersonDao {

	void createPersonTable();

	void insert(Person person);

	Optional<Person> selectById(int id);

	List<Person> selectAll();

	void delete(int id);

	void update(Person person,int id);

}
