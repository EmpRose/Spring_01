package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Pet pet;
    private String surname;
    private int age;

    public Person(){
        System.out.println("Person bean created");
    }

    /*
    @Autowired
    public Person(@Qualifier("dog")Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }
     */
    /*
    @Autowired
    public void setPet(Pet pet){
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
     */

    public void callYourPet(){
        System.out.println("Hello lovely Pet.");
        pet.say();
    }
}
