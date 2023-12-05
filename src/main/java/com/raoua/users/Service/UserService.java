package com.raoua.users.Service;

import java.util.List;

import com.raoua.users.entities.Role;
import com.raoua.users.entities.User;

public interface UserService {
	User saveUser(User user);
	
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
}
