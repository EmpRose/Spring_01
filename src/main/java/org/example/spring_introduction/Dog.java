package org.example.spring_introduction;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

    public Dog(){
        System.out.println("Dog Bean created.");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
