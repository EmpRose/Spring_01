package org.example.spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean") // oder nur "@Component" dan ist das id by default "cat" (Bei mehreren gr Buchstaben "SQLTest" by default identisch "SQLTest")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat Bean created.");
    }
    @Override
    public void say(){
        System.out.println("Meow-Meow");
    }
}
