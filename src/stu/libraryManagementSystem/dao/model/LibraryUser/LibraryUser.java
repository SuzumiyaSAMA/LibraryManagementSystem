package stu.libraryManagementSystem.dao.model.LibraryUser;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class LibraryUser implements java.io.Serializable {

	// Fields

	private Integer no;
	private String name;
	private String password;

	// Constructors

	/** default constructor */
	public LibraryUser() {
	}

	/** minimal constructor */
	public LibraryUser(Integer no) {
		this.no = no;
	}

	/** full constructor */
	public LibraryUser(Integer no, String name, String password) {
		this.no = no;
		this.name = name;
		this.password = password;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}