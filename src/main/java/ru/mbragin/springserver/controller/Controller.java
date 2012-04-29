package ru.mbragin.springserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mbragin.springserver.domain.User;
import ru.mbragin.springserver.service.UserService;

import java.util.List;

/**
 * User: mbragin
 * Date: 28.04.12
 * Time: 15:33
 */
@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}", headers = "Accept=application/json")
    public @ResponseBody User getUsrById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users", headers = "Accept=application/json")
    public @ResponseBody List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
