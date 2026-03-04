package guli.springframework.spring6di.services.i18n;

import guli.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("pt-br")
@Service("i18NService")
public class PortugueseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Olá mundo - Versão Brasileira!!!";
    }
}
