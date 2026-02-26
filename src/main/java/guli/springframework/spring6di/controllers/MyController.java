package guli.springframework.spring6di.controllers;

import guli.springframework.spring6di.services.GreetingService;
import guli.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();    // isso é totalmente errado, não é assim que funciona DI e é uma prática ruim
    }                                                        // existe de fato uma dependência mas essa dependência não foi injetada via DI pelo Spring, o que
                                                             // da forma como está, testes são muito piores de serem feitos e existe um alto acoplamento, nesse momento o Controller controla tudo,
                                                             // se porventura a classe que implementa esse metodo mudar, vai precisar alterar no Controller também e iso não é bom.

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }

}
