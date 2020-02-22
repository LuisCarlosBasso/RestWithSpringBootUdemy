package br.com.luis.restwithspringboot.services;

import br.com.luis.restwithspringboot.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person){
        return person;
    }

    public Person update(Person person){
        return person;
    }

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Luis");
        person.setLastName("Saraiva");
        person.setAddress("Américo de Campos - São Paulo - Brasil");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name" + i);
        person.setLastName("Last name" + i);
        person.setAddress("Some address in Brasil" + i);
        person.setGender("Male" + i);
        return person;
    }

}
