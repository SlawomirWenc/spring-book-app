package com.example.LibraryApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/test1")
    public String text1(){
        return "Everybody can see this text";
    }

    @RequestMapping("/test2")
    public String text2(){
        return "Only users can see this text";
    }

    @RequestMapping("/test3")
    public String text3(){
        return "Only admins can see this text";
    }

    @RequestMapping("/test4")
    public String text4(){
        return "No one will see this text";
    }

}
