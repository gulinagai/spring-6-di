package guli.springframework.spring6di.controllers.operatingEnviroments;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"uat", "pt-br"})
@SpringBootTest
class MyControllerEnvTestUat {

    @Autowired
    MyControllerEnv myControllerEnv;

    @Test
    void whichEnvironment() {
        System.out.println(myControllerEnv.whichEnvironment());
    }
}