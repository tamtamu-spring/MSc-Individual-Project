package com.msc.services;

import com.msc.dao.DAO;
import com.msc.model.User;
import org.springframework.transaction.annotation.Transactional;

import javax.ejb.EJB;
import java.util.Collection;
import java.util.List;

/**
 * Created by Paul on 25/07/2017.
 */
public class ServiceImplementation implements ServiceUser {
    @EJB
    private DAO userDAO;

    // Constructors are for beans
    public void setUserDAO(DAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public Collection<User> getUsers() {
        return null;
    }

    @Override
    @Transactional
    public void addUser(User u) {
        userDAO.addUser(u);
    }

    @Override
    @Transactional
    public void updateUser(User u) {
        userDAO.updateUser(u);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void removeUser(String username) {
        userDAO.removeUser(username);
    }

    @Override
    public User findByUserName(String username) {
        return userDAO.findByUserName(username);
    }
}