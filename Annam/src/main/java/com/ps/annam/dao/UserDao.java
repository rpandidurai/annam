/**
 * 
 */
package com.ps.annam.dao;

import java.util.List;

import com.ps.annam.dto.User;

/**
 * @author Pandidurai
 *
 */
public interface UserDao {
	
	void addUser(User user);

	List<User> listUser();
}
