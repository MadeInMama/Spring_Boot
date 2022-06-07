package com.user.test.services;

import com.user.test.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(long id);

    void save(User user);

    void deleteById(long id);
}
