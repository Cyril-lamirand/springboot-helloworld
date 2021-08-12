package springapp.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springapp.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {

    @Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetHelloWorld() {
        String expected = "Hello World";
        String result = bs.getHelloWorld().getValue();

        if (expected == result) {
            System.out.println("Test is ok !");
        } else {
            System.out.println("Wrong result");
        }
    }

}
