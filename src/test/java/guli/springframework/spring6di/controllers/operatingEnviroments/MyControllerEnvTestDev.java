package guli.springframework.spring6di.controllers.operatingEnviroments;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles({"dev", "en"})
@SpringBootTest
class MyControllerEnvTestDev {

    @Autowired
    MyControllerEnv myControllerEnv;


    @Test
    void whichEnvironment() {
        System.out.println(myControllerEnv.whichEnvironment());
    }
}