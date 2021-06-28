package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        String s = myController.sayHello();
        System.out.println(s);
    }

}
