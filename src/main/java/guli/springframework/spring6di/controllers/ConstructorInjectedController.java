package guli.springframework.spring6di.controllers;

import guli.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //@Autowired  // opcional
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;      // essa forma é a mais recomendada, mas nesse exemplo em específico, a DI está sendo apliucada puramente, sem
                                                     // qualquer ação do Spring, apesar de utilizarmos as 3 formas: field, setter e constructor, são as 3 mas sem o Spring
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
