package com.leopard.service;

import com.leopard.dto.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring framework", "vdvdda"),
            new Topic("java", "java framework", "vdvdda"),
            new Topic("javascript", "javascript framework", "vdvdda")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        for (Topic topic : topics) {
            if (topic.getId().equals(id)) {
                return topic;
            }
        }
        return new Topic("NotFound", "Not Found", "Not Found");
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
        for(Topic topic:topics){
            if(topic.getId().equals(id)){
                topics.remove(topic);
            }
        }

    }


}
