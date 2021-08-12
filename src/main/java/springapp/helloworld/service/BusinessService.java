package springapp.helloworld.service;

import org.springframework.stereotype.Component;
import springapp.helloworld.model.HelloWorld;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
