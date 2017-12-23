package stu.libraryManagementSystem.action;

import stu.libraryManagementSystem.dao.BookOperatrion.*;
import stu.libraryManagementSystem.dao.model.book.book;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	book book = new book();
	public book getBook() {
		return book;
	}

	public void setBook(book book) {
		this.book = book;
	}

	INFBookOperatrion operation = new BookOperation();
	
	public String SearchBook(){
		this.book = operation.SearchBook(this.book.getName());
		if(this.book == null)
			return "NoBookError";
		HttpSession session = ServletActionContext.getRequest().getSession();		
		session.setAttribute("BookNo", this.book.getNo());
		session.setAttribute("BookName", this.book.getName());
		session.setAttribute("BookWriter", this.book.getWriter());
		session.setAttribute("BookPublisher", this.book.getPublisher());
		session.setAttribute("BookNumber", this.book.getNumber());
		return SUCCESS;
	}
	
	public String BorrowBook(){
		this.book = operation.SearchBook((String)ServletActionContext.getRequest().getSession().getAttribute("BookName"));
		operation.BorrowBook(this.book);
		return SUCCESS;
	}
	
	public String ReturnBook(){
		this.book = operation.SearchBook(this.book.getName());
		if(this.book == null)
			return "NoBookError";
		operation.ReturnBook(this.book);
		return SUCCESS;
	}
	
	public String RecordBook(){
		operation.RecordBook(this.book);
		return SUCCESS;
	}
}
