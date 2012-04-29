package ru.mbragin.springserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mbragin.springserver.dao.UserDao;
import ru.mbragin.springserver.domain.User;
import ru.mbragin.springserver.service.UserService;

import java.util.List;

/**
 * User: mbragin
 * Date: 28.04.12
 * Time: 15:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
