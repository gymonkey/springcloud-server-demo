package app.nebula.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String root(){
        return "ok";
    }

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable("name") String name) {
        System.out.println("recv req " + name);
        return "hello world " + name;
    }

}
