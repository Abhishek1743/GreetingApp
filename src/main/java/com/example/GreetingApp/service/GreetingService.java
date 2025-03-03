package com.example.GreetingApp.service;

import com.example.GreetingApp.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public Greeting getGreetingMessage() {
        return new Greeting("Hello World");
    }

    public Greeting postGreetingMessage(Greeting greeting) {
        return new Greeting("Received POST request with message: " + greeting.getMessage());
    }

    public Greeting putGreetingMessage(Greeting greeting) {
        return new Greeting("Received PUT request with message: " + greeting.getMessage());
    }
}