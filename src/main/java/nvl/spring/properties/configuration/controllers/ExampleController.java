package nvl.spring.properties.configuration.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
   @GetMapping("/")
    public String getHello() {
        return "Hello world";
    }
}
