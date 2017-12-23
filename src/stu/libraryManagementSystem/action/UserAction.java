package stu.libraryManagementSystem.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import stu.libraryManagementSystem.dao.UserOperation.*;
import stu.libraryManagementSystem.dao.model.LibraryUser.LibraryUser;

public class UserAction extends ActionSupport {
	LibraryUser user = null;
	INFUserOperation operation = new UserOperation();
	
	public String UserCheck(){
		String name = user.getName();
		String password = user.getPassword();
		String result = ERROR;
		switch(operation.UserCheck(name, password)){
		case 0:{
			result = "NoUserError";
			break; 
		}
		case 1:{
			result = "PasswordError";
			break;
		}
		case 2:{
			result = SUCCESS;
			ServletActionContext.getRequest().getSession().setAttribute("user.name", user.getName());
		}
		}
		return result;
	}

	public LibraryUser getUser() {
		return user;
	}

	public void setUser(LibraryUser user) {
		this.user = user;
	}
	
}
