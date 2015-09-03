/**
 * 
 */
package com.ps.annam.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ps.annam.dao.UserDao;
import com.ps.annam.dto.User;

/**
 * @author Pandidurai
 *
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void addUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

	public List<User> listUser() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from User");
	}
}
