package com.springapp.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class FirstspringappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstspringappApplication.class, args);
        System.out.println("hello world");
    }
    @GetMapping(value="/{firstName}")
    public String helloGET (
            @PathVariable("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
                return String.format(
                        "{\"message\":\"Hello %s %s\"}",firstName,lastName);
            }
    }

    class HelloRequest {
    private String firstName;
    private String lastName;
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName (String firstName) {
        this.firstName=firstName;
    }
    public String getLastName(){
            return lastName;
    }
    public void setLastName (String lastName) {
            this.lastName=lastName;
    }
    }

