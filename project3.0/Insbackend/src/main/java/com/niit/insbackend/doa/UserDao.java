package com.niit.insbackend.doa;
import java.util.List;


import com.niit.insbackend.model.User;

public interface UserDao {
	public List<User> getAllUser();
	public void saveorupdate(User user);
	
}
