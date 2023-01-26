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
        return "Just try to do some work.";
    }
    // this method will override the Whitelabel error page
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
