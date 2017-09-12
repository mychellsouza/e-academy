package com.puc.tcc.eacademy.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
