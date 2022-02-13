package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDAO;
import br.com.cod3r.bridge.mvc.model.User;

public class UserRest extends UserService{

	public UserRest(UserDAO dao) {
		super(dao);
	}

	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
