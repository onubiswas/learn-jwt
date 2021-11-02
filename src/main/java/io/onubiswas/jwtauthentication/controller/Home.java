package io.onubiswas.jwtauthentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Hello {


    private String name;

    public Hello(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@RestController
public class Home {

    @RequestMapping("/welcome")
    public String welcome(){
        String text= "This ia private page";

        return text;
    }
    @RequestMapping("/getusers")
    public Hello getUser(){
        return new Hello("Anupama");
    }

}
