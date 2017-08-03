package org.learn.forum.domain;

import java.util.HashSet;
import java.util.Set;

public class Question {

	private int id;

	private String header;
	private String description;
	private Topic topic;

	private ForumUser createdUser;
	private Set<Answer> answers = new HashSet<Answer>();

	Question() {
		super();
	}

	public Question(String header, String description) {
		super();
		this.header = header;
		this.description = description;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public String getDescription() {
		return description;
	}

	public String getHeader() {
		return header;
	}

	public int getId() {
		return id;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public ForumUser getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(ForumUser createdUser) {
		this.createdUser = createdUser;
	}

}
