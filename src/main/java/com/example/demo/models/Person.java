package com.example.demo.models;

import org.omg.CORBA.NameValuePairHelper;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public Person () {

    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
