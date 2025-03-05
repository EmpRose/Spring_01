package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //@Autowired
    //@Qualifier("catBean")
    private Pet pet;

    // @Value("Pospelov") = hardcodet -> nicht die beste Art
    @Value("${person.surname}") // ersetzt "Setter"
    private String surname;
    @Value("${person.age}")
    private int age;

    /*
    public Person(){
        System.out.println("Person bean created");
    }
     */


    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

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

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
