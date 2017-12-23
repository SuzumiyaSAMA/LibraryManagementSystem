package stu.libraryManagementSystem.dao.BookOperatrion;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import stu.libraryManagementSystem.dao.SessionFactory.HibernateSessionFactory;
import stu.libraryManagementSystem.dao.model.book.book;

public class BookOperation implements INFBookOperatrion {

	public BookOperation(){}
	
	@Override
	public book SearchBook(String name) {
		String HQL = "from book t where t.name='"+name+"'";
		Query query = HibernateSessionFactory.getSession().createQuery(HQL);
		List list = query.list();
		Iterator it = list.iterator();
		HibernateSessionFactory.closeSession();
		if(!it.hasNext())
			return null;
		return (book) it.next();
	}
	
	@Override
	public void BorrowBook(book bookInformation) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String HQL = "update book t set t.number=t.number-1 where t.name='"+bookInformation.getName()+"'";
		Query q = session.createQuery(HQL);
		q.executeUpdate();
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}
	
	@Override
	public void ReturnBook(book bookInformation) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		String HQL = "update book t set t.number=t.number+1 where t.name='"+bookInformation.getName()+"'";
		Query q = session.createQuery(HQL);
		q.executeUpdate();
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();

	}

	@Override
	public void RecordBook(book bookInformation) {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		if(bookInformation.getNo() == null || bookInformation.getNo().equals("")){
			System.out.println("addnewBook");
			String HQL = "select max(t.no) from book as t";
			Query query = session.createQuery(HQL);
			List list = query.list();
			Iterator it = list.iterator();
			Integer no = (Integer)it.next();
			bookInformation.setNo(no+1);
		}
		bookInformation.setNumber("1");
		session.save(bookInformation);
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
	}

}
