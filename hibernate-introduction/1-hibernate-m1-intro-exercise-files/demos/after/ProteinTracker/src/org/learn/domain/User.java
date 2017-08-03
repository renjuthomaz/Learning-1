package org.learn.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private String name;
	private int travelCount;

	private UserAddress userAddress;
	// one to many.
	private List<UserHistory> userHistories = new ArrayList<UserHistory>();
	// one to one
	private UserContact contact;

	public User() {
		super();
	}

	public User(String name, int travelCount) {
		super();
		this.name = name;
		this.travelCount = travelCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTravelCount() {
		return travelCount;
	}

	public void setTravelCount(int travelCount) {
		this.travelCount = travelCount;
	}

	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}

	public List<UserHistory> getUserHistories() {
		return userHistories;
	}

	public void setUserHistories(List<UserHistory> userHistories) {
		this.userHistories = userHistories;
	}

	public UserContact getContact() {
		return contact;
	}

	public void setContact(UserContact contact) {
		this.contact = contact;
	}

	/**
	 * Method to add user history to user and to keep a reference back to the
	 * user.
	 * 
	 * @param history
	 */
	public void addUserHistory(UserHistory history) {
		history.setUser(this);
		userHistories.add(history);
	}

}
