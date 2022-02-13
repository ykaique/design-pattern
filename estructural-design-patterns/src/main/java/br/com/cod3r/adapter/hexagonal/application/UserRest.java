package br.com.cod3r.adapter.hexagonal.application;

import br.com.cod3r.adapter.hexagonal.core.model.User;
import br.com.cod3r.adapter.hexagonal.core.ports.UserRepository;
import br.com.cod3r.adapter.hexagonal.core.usecases.UserService;
import br.com.cod3r.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UserRest {

	private final UserService userService;

	public UserRest() {
		UserRepository userRepository = new UserMemoryDatabaseAdapter();
		userService = new UserService(userRepository);
	}

	public Integer post(Map<String, String> values) {
		try {
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			userService.saveUser(user);
			return 200;
		}catch (Exception e){
			System.out.println(e.getMessage());
			return 400;
		}
	}
	
	public Integer get() {
		List<User> users = userService.getUsers();
		users.forEach(System.out::println);
		return 200;
	}
}
