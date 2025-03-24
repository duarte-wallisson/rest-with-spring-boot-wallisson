package br.com.wallisson.service;

import br.com.wallisson.model.Person;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Log
@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        log.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Lima");
        person.setLastName("Duarte");
        person.setAddress("Brasília");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        var peoples = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            peoples.add(person);
        }
        return peoples;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Lima" + i);
        person.setLastName("Duarte"+ i);
        person.setAddress("Brasília");
        person.setGender("Male");
        return person;
    }

    public Person savePerson(Person person) {
        log.info("Saving one Person!");
        return person;
    }

    public void deleteById(String id) {
        log.info("Deleting one Person!");
    }
}
