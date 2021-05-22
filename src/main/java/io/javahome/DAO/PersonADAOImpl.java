package io.javahome.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import io.javahome.model.Person;

public class PersonADAOImpl implements PersonDAO {
	@Autowired
	private SessionFactory sf;

	@Override
	public List<Person> getALLPersons() {
		Session s = sf.openSession();
		s.beginTransaction();
		List<Person> persons = s.createQuery("from Person").list();
		return persons;
	}

}
