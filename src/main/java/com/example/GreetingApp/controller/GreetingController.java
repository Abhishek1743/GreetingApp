package com.example.GreetingApp.controller;

import com.example.GreetingApp.model.Greeting;
import com.example.GreetingApp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public Greeting getGreeting() {
        return greetingService.getGreetingMessage();
    }

    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return greetingService.postGreetingMessage(greeting);
    }

    @PutMapping
    public Greeting putGreeting(@RequestBody Greeting greeting) {
        return greetingService.putGreetingMessage(greeting);
    }
}
