package ru.mbragin.springserver.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.mbragin.springserver.dao.UserDao;
import ru.mbragin.springserver.domain.User;
import ru.mbragin.springserver.domain.UserDataBase;

import java.util.List;

/**
 * User: mbragin
 * Date: 28.04.12
 * Time: 15:36
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    UserDataBase userDataBase;

    public User getUserById(long id) {
        return userDataBase.getUser(id);
    }

    public List<User> getAllUsers() {
        return userDataBase.getAllUsers();
    }
}
