package pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.dto.UserDto;
import pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.model.User;
import pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomasz Sokół on 2019-03-20.
 */
@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<UserDto> getUsers() {
        List<UserDto> res = new ArrayList<>();
        for (User u : usersRepository.findAll()) {
            UserDto d = new UserDto();
            d.setFirstName(u.getFirstName());
            d.setLastName(u.getLastName());
            res.add(d);
        }
        return res;
    }
}
