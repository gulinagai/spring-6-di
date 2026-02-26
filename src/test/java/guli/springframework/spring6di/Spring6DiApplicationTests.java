package guli.springframework.spring6di;

import guli.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    // explicando esse código de teste:

    @Autowired // essa anotação diz ao IoC Container para injetar um bean do tipo ApplicationContext, que na verdade é uma instância da classe que implementa a hierarqua  onde o ApplicationContext(inrterface) existe
    ApplicationContext applicationContext;   // ou seja, o IoC Container injeta ele mesmo nesse atributo como referência.

    @Autowired // aqui ocorre o mesmo, mas com um bean do tipo MyController
    MyController myController;

    @Test // essa anotação indica ao JUnit que deve ser tratado como um teste.
    void testAutowireOfController() {
        System.out.println(myController.sayHello()); // aqui o bean já foi injetado lá no atributo
    }

    @Test  // essa anotação indica o mesmo do de cima, em relação ao JUnit.
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class); // o que acontece aqui é que, o bean (que na verdade é o próprio Container)
        // que foi injetado no atributo applicationContext é chamado, e acessado o metodo getBean(), que retorna "manualmente, sem DI" o bean dentro do IoC Container
        // conhecido como "Dependency Lookup"

        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
