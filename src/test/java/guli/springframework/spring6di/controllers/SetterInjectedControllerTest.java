package guli.springframework.spring6di.controllers;

import guli.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl()); // outra forma de DI sem Spring, entratanto, o setter é obrigatório para que a injeção
        // funcione
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}