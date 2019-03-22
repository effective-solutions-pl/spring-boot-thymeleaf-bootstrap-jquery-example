package pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.dto.UserDto;

import java.util.List;

/**
 * Created by Tomasz Sokół on 2019-03-22.
 */
@Data
@AllArgsConstructor
public class UserListResult {
    private List<UserDto> data;
}
