package guli.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyInjectionService")
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Property injection!";
    }

}
