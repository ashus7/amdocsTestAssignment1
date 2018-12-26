package com.assignment.service;

import java.util.List;

import com.assignment.model.User;

public interface UserService {

	Integer save(User user) throws Exception;
	   User get(Integer id) throws Exception;
	   List<User> list() throws Exception;
	   void update(Integer id, User user) throws Exception;
	   void delete(Integer id);
}
