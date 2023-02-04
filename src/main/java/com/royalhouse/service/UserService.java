package com.royalhouse.service;

import java.util.List;

import com.royalhouse.model.User;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}
