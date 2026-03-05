package guli.springframework.spring6di.services.operatingEnviroments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class EnvironmentTestImplDev implements EnvironmentTest {
    @Override
    public String testing() {
        return "In DEV environment!";
    }
}
