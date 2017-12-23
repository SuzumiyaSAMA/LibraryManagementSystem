package stu.libraryManagementSystem.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import stu.libraryManagementSystem.dao.UserOperation.*;
import stu.libraryManagementSystem.dao.model.LibraryUser.LibraryUser;

public class UserAction extends ActionSupport {
	LibraryUser user = new LibraryUser();
	INFUserOperation operation = new UserOperation();
	
	@Override
	public void validate(){
		if(user.getName() == null || user.getName().trim().equals("")){
			addFieldError("user.name", "Please enter your name!");
			return;
		}
		if(user.getPassword() == null || user.getPassword().trim().equals("")){
			addFieldError("user.password", "Please enter your password!");
			return;
		}
		switch(operation.UserCheck(user.getName(), user.getPassword())){
		case 0:{
			addFieldError("user.name", "No such user! Please check your name.");
			break; 
		}
		case 1:{
			addFieldError("user.password", "Password error! Please Check your password.");
			break;
		}
		case 2:{
			ServletActionContext.getRequest().getSession().setAttribute("user.name", user.getName());
			return;
		}
		}
	}
	
	public String UserCheck(){
		return SUCCESS;
	}

	public LibraryUser getUser() {
		return user;
	}

	public void setUser(LibraryUser user) {
		this.user = user;
	}
	
}
