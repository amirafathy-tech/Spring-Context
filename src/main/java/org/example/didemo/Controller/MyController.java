package org.example.didemo.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("hello");
        return "foo";
    }
}

