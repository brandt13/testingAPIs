package com.what.ever.services;

import com.what.ever.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);

}