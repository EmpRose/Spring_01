package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Dog myDog = context.getBean("dogBean",Dog.class);
        //Dog yourDog = context.getBean("dogBean",Dog.class);

        //System.out.println("Selbe Referenz? " + (myDog == yourDog));
        //System.out.println(myDog);
        //System.out.println(yourDog);

        myDog.say();

        context.close();
    }
}
