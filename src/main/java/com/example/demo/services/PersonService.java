package com.example.demo.services;

import com.example.demo.models.Person;
import com.example.demo.respositories.PersonRepository;

import java.util.List;

public class PersonService {

    private PersonRepository personRepository;

    public List<Person> list() {
        return personRepository.findAll();
    }

    public void addUser(Person person) {
        personRepository.save(person);
    }

    public List<Person> getAllUser() {
        return personRepository.findAll();
    }
}
