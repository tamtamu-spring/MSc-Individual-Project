package com.msc.services;

import com.msc.model.User;
import com.msc.model.UserRole;

import java.util.Collection;
import java.util.List;

/**
 * Created by Paul on 25/07/2017.
 */
public interface ServiceUser {
    public Collection<User> getUsers();
    public void addUser(User u, UserRole ur);
    public void updateUser(User u);
    public List<User> listUsers();
    public User getUserById(int id);
    public void removeUser(String username);
    public User findByUserName(String username);
    //public void addUserRole(UserRole ur);
}
