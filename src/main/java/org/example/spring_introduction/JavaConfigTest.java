package org.example.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();

        System.out.println("---");

        // Kein neues Person Bean, da singleton
        //Person person1 = context.getBean("personBean",Person.class);

        person.getSurname();
        person.getAge();

        context.close();

    }
}
