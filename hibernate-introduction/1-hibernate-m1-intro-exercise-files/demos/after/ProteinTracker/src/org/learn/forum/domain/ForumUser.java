package org.learn.forum.domain;

import java.util.HashSet;
import java.util.Set;

public class ForumUser {
	private int id;

	private String userName;
	private Set<Topic> interestedTopics = new HashSet<Topic>();

	public ForumUser() {
		super();
	}

	public ForumUser(String userName, Set<Topic> interestedTopics) {
		super();
		this.userName = userName;
		this.interestedTopics = interestedTopics;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<Topic> getInterestedTopics() {
		return interestedTopics;
	}

	public void setInterestedTopics(Set<Topic> interestedTopics) {
		this.interestedTopics = interestedTopics;
	}

}
