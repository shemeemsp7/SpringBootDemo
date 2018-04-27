package com.sps.boot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =new ArrayList<Topic>(Arrays.asList(
			new Topic("java","java",""),
			new Topic("sql","sql",""),
			new Topic("c","c","")
	));
	
	public List<Topic> getAllTopics(){
		return topics;
		
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}
	
	public String addTopic(Topic topic) {
		topics.add(topic);
		return "topic has been added successfully.";
	}
}
