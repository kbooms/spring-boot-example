package com.kevinbooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "You've got this. Just try to do your best.";
    }
    // this method will override the Whitelabel error page. It is called by default because we have declared this
    // application as a Rest Controller with the @RestController annotation


    // this code below is a JSON test. I'll leave it in for now.
    @GetMapping("/json_test")
    public GreetResponse greet() {
        GreetResponse response = new GreetResponse(
                "Go ahead. Make my day.",
                List.of("Java", "Python", "JavaScript"),
                new Person("Kevin")
        );
        return response;
    }

    record Person (String name) {}
    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person){}; // records are classes that allow us to achieve immutability
}
