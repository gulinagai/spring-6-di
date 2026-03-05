package guli.springframework.spring6di.services.operatingEnviroments;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class EnvironmentTestImplQa implements EnvironmentTest {
    @Override
    public String testing() {
        return "In QA environment!";
    }
}
