package com.example.demo;

import com.example.demo.domain.Address;
import com.example.demo.domain.Family;
import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class PersonApplicationTests {
    @Autowired
    private PersonRepository repository;
    @Test



    public void selectPerson() {
        Person person =new Person("张","有才");
        Person person1= new Person("James","Harden");

        Address address =new Address("北京","China");
        person.setAddress(address);


        List<Family> list = new ArrayList<>();
        Family dad=new Family("父亲","张三");
        Family mom=new Family("母亲","李兰");
        list.add(dad);
        list.add(mom);
        person.setFamilyList(list);
        Person save =repository.save(person);
        Person save1=repository.save(person1);
        System.out.println(save);
        System.out.println(save1);

    }
}
