package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    GreetingClient greetingClient;

    @RequestMapping("/greetings-in-feign-client")
    public String greetings() {
        return greetingClient.greeting();
    }
}
