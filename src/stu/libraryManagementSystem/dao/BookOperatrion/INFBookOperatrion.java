package stu.libraryManagementSystem.dao.BookOperatrion;

import stu.libraryManagementSystem.dao.model.book.book;

public interface INFBookOperatrion {
	public book SearchBook(String name);
	public void ReturnBook(book bookInformation);
	public void BorrowBook(book bookInformation);
	public void RecordBook(book bookInformation); 
}
