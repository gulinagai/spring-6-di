package guli.springframework.spring6di.controllers.operatingEnviroments;

import guli.springframework.spring6di.services.operatingEnviroments.EnvironmentTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerEnv {

    @Autowired
    private final EnvironmentTest environmentTest;

    public MyControllerEnv(EnvironmentTest environmentTest) {
        this.environmentTest = environmentTest;
    }

    public String whichEnvironment() {
        return environmentTest.testing();
    }
}
