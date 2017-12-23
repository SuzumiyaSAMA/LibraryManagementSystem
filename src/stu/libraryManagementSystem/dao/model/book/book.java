package stu.libraryManagementSystem.dao.model.book;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class book implements java.io.Serializable {

	// Fields

	private Integer no;
	private String name;
	private String writer;
	private String publisher;
	private String number;

	// Constructors

	/** default constructor */
	public book() {
	}

	/** minimal constructor */
	public book(Integer no) {
		this.no = no;
	}

	/** full constructor */
	public book(Integer no, String name, String writer, String publisher, String number) {
		this.no = no;
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.number = number;
	}

	// Property accessors

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}