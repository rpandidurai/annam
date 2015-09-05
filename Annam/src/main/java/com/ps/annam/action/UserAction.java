/**
 * 
 */
package com.ps.annam.action;

import com.opensymphony.xwork2.ModelDriven;
import com.ps.annam.bo.UserBo;
import com.ps.annam.dto.User;

/**
 * @author Pandidurai
 *
 */
public class UserAction implements ModelDriven{

	UserBo userBo;
	
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return userBo;
	}
	public String execute() throws Exception {
		System.out.println("************************************** user action");
		
		User user = new User();
		user.setName("ps");
		 
		return "SUCCESS";
	}
}
