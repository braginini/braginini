package ru.mbragin.springserver.service;

import ru.mbragin.springserver.domain.User;

import java.util.List;

/**
 * User: mbragin
 * Date: 28.04.12
 * Time: 15:36
 */
public interface UserService {

    User getUserById(long id);

    List<User> getAllUsers();
}
