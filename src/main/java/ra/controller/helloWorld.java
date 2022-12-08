package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("helloWorld")
public class helloWorld {
    @RequestMapping("hello123")
    public String hello (){
        return "hello";
    }
}
