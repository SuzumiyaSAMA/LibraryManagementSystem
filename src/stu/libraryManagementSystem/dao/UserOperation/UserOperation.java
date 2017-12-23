package stu.libraryManagementSystem.dao.UserOperation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import stu.libraryManagementSystem.dao.SessionFactory.HibernateSessionFactory;
import stu.libraryManagementSystem.dao.model.LibraryUser.*;

public class UserOperation implements INFUserOperation{
	private LibraryUser user = new LibraryUser();
	
	public UserOperation(){}
	
	@Override
	public int UserCheck(String name, String password){
		String hql = "from LibraryUser u where u.name='"+name+"'";
		Query query = HibernateSessionFactory.getSession().createQuery(hql);
		List list = query.list();
		Iterator it = list.iterator();
		int result = 0;
		if(it.hasNext()){
			result = 1;
			user = (LibraryUser)it.next();
			if(user.getPassword().trim().equals(password))
				result = 2;
		}
		HibernateSessionFactory.closeSession();
		return result;
	}
}