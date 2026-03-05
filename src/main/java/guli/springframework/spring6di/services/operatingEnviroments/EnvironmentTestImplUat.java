package guli.springframework.spring6di.services.operatingEnviroments;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class EnvironmentTestImplUat implements EnvironmentTest {
    @Override
    public String testing() {
        return "In UAT environment!";
    }
}
