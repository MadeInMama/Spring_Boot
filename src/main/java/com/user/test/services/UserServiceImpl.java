package com.user.test.services;

import com.user.test.entities.User;
import com.user.test.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository source;

    @Override
    public List<User> getAll() {
        return source.findAll();
    }

    @Override
    public User getById(long id) {
        return source.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        source.save(user);
    }

    @Override
    public void deleteById(long id) {
        source.deleteById(id);
    }
}
