package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	@Autowired
	
	private TopicRepository topicRepository;
	
	
	
	
	
	public List<Topic> getAllTopics() {
		return StreamSupport.stream(topicRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public Optional<Topic> getTopic(String id) {
		
		return topicRepository.findById(id);
	}

	public void addTopic(Topic t) {
		topicRepository.save(t);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
