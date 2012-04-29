package ru.mbragin.springserver.dao;

import ru.mbragin.springserver.domain.User;

import java.util.List;

/**
 * User: mbragin
 * Date: 28.04.12
 * Time: 15:35
 */
public interface UserDao {

    User getUserById(long id);

    List<User> getAllUsers();
}
