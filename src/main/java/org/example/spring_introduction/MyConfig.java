package org.example.spring_introduction;

import org.springframework.context.annotation.*;


// without scan @Component notwendig

/*
@Configuration
@ComponentScan("org.example.spring_introduction")
public class MyConfig {
}
*/

@Configuration
@ComponentScan("org.example.spring_introduction") // Für Bean Scan
@PropertySource("classpath:myApp.properties") //Für @Value Annotation
public class MyConfig {

    // erstellt und gitb als rückgabewert ein Cat Object
    @Bean //Methodenname = Bean ID
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }


    @Bean
    public Person personBean(){
        return new Person(catBean());
    }


}