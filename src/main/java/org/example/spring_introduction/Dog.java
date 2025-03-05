package org.example.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
//@Scope("prototype")
@Scope("singleton")
public class Dog implements Pet{

    public Dog(){
        System.out.println("Dog Bean created.");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    // Ab Java 11, nur mit Maven nutzbar https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2
    //@PostConstruct
    //public void init(){
    //    System.out.println("Class Dog: init Method");
    //}

    // Ab Java 11, nur mit Maven nutzbar https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2
    //@PreDestroy
    //public void destroy(){
    //    System.out.println("Class Dog: destroy Method");
    //}
}
