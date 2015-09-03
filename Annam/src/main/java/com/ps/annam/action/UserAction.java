/**
 * 
 */
package com.ps.annam.action;

import com.ps.annam.dto.User;

/**
 * @author Pandidurai
 *
 */
public class UserAction {

	public String execute() throws Exception {
		System.out.println("************************************** user action");
		
		User user = new User();
		user.setName("ps");
		
		return "SUCCESS";
	}
}
