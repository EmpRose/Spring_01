package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationComponentExample {
    public static void main(String[] args) {
        // Start Scan von Paketen
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // Ende Scan von Paketen

        Person person = context.getBean("personBean",Person.class);

        person.callYourPet();

        //Pet pet = context.getBean("catBean", Cat.class);
        //pet.say();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());


        context.close();
    }
}
