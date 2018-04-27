package com.sps.boot.topic;

public class Topic {
	
	private String id; 
	private String topicName;
	private String description;
	
	public Topic() {
		super();
	}
	
	public Topic(String id,String name,String description) {
		super();
		this.id=id;
		this.topicName=name;
		this.description=description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
