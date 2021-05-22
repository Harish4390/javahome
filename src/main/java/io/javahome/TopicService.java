package io.javahome;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	// Getting single resource

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}

	// POST (Create) new person

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void addTopic(String id, Topic topic) {
		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
