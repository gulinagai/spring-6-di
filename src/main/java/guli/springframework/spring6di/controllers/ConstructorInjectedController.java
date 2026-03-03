package guli.springframework.spring6di.controllers;

import guli.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;

    //@Autowired  // opcional
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;

    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
