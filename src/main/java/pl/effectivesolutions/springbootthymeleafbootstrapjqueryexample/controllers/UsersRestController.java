package pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.dto.UserDto;
import pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.service.UsersService;

import java.util.List;

/**
 * Created by Tomasz Sokół on 2019-03-20.
 */
@RestController
public class UsersRestController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users/all")
    public List<UserDto> getAllUsers() {
        return usersService.getUsers();
    }
}
