package ru.naumov.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

/**
 * @author Vadim Naumov
 */
@Controller
public class HelloController {

    @GetMapping("/hello-vasa")
    public String sayVasa(){
        return "hello_vasa";
    }

    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }

    long[] e = new long[3];
    int r = e.length;
}
