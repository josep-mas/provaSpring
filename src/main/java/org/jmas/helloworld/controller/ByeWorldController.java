package org.jmas.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jmas6")
public class ByeWorldController {


    @RequestMapping
    public String sayBye() {
        return "Bye World!";
    }

    @RequestMapping("/farewell")
    public String farewell() {
        return "Farewell from JMAS 6!";
    }
}
