package org.learn.domain;

public class UserContact {

	private int id;
	private String cellNo;
	private String emailId;
	private User user;

	public UserContact() {
		super();
	}

	public UserContact(String cellNo, String emailId, User user) {
		super();
		this.cellNo = cellNo;
		this.emailId = emailId;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCellNo() {
		return cellNo;
	}

	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
