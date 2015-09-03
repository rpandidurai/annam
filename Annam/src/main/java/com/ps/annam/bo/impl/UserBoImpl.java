/**
 * 
 */
package com.ps.annam.bo.impl;

import java.util.List;

import com.ps.annam.bo.UserBo;
import com.ps.annam.dao.UserDao;
import com.ps.annam.dto.User;

/**
 * @author Pandidurai
 *
 */
public class UserBoImpl implements UserBo {

	UserDao userDao;

	public void setUserDAO(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	public List<User> listUser() {
		// TODO Auto-generated method stub
		return userDao.listUser();
	}
}
