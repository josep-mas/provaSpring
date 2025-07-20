package org.jmas.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jmas5")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        String message = "Hello World 222!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        String message = "Greetings from JMAS 5!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
