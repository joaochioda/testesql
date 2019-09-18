package com.example.demo.controller;


import com.example.demo.models.Person;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST, value="/user")
    public void AddIngrediente(@RequestBody Person person) {
        personService.addUser(person);
    }

    @RequestMapping("/user")
    public List<Person> GetAllIngredientes() {
        return personService.getAllUser();
    }

}
