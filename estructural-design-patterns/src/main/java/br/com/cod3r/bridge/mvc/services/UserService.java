package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDAO;
import br.com.cod3r.bridge.mvc.model.User;

public abstract class UserService {
    protected UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
