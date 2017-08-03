package org.learn.forum.domain;

public class Topic {

	private int id;
	private String topicName;

	Topic() {
		super();
	}

	public Topic(String topicName) {
		super();
		this.topicName = topicName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

}
