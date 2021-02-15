package org.springMVC.Dao;

import org.springMVC.services.UserModel;

public interface UserModelDao {
	public void registerUser(UserModel user);
	public void validateUser(UserModel user);
	
}
