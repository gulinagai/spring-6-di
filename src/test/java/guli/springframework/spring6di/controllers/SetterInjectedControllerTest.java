package guli.springframework.spring6di.controllers;

import guli.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

//    @BeforeEach
//    void setUp() {
//        setterInjectedController = new SetterInjectedController();
//        setterInjectedController.setGreetingService(new GreetingServiceImpl()); // outra forma de DI sem Spring, entratanto, o setter é obrigatório para que a injeção
//        // funcione
//    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}