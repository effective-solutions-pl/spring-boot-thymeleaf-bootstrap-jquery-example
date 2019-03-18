package pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Tomasz Sokół on 2019-03-18.
 */
@Controller
public class UsersController {

    @GetMapping("/users")
    public String showSignUpForm() {
        return "users";
    }
}
