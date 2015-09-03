/**
 * 
 */
package com.ps.annam.bo;

import java.util.List;

import com.ps.annam.dto.User;

/**
 * @author Pandidurai
 *
 */
public interface UserBo {

	void addUser(User user);
	
	List<User> listUser();
}
