package ru.otus.spring.dao;

import ru.otus.spring.domain.Person;

public class PersonDaoSimple implements PersonDao {

    private int defaultAge;

    public PersonDaoSimple() {
    }

    public void setDefaultAge(int defaultAge) {
        this.defaultAge = defaultAge;
    }

    public int getDefaultAge() {
        return defaultAge;
    }

    public Person findByName(String name) {
        return new Person(name, defaultAge);
    }
}
