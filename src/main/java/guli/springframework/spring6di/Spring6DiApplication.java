package guli.springframework.spring6di;

import guli.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyController controller = ctx.getBean(MyController.class); // aqui o bean (instância) de MyController já está criado, estou buscando ele já criado pelo IoC Container, que é o objeto apontado pela variável ctx nesse caso
                                                                   // isso mostra que estamos acessando o Context Spring/IoC Container e o bean contido nele, que aliás, foi criado por ele também.
        System.out.println("In Main Method!");

        System.out.println(controller.sayHello());
    }

}
