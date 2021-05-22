package io.javahome.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javahome.model.Person;
import io.javahome.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public List<Person> getAllPersons() {
		return personService.getALLPersons();
	}

}
