package io.javahome.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import io.javahome.DAO.PersonDAO;
import io.javahome.model.Person;

public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO personDAO;

	@Override
	@Transactional
	public List<Person> getALLPersons() {
		return personDAO.getALLPersons();
	}

}
