package jprogr.springbootquickstart.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import jprogr.springbootquickstart.entities.Topic;
import jprogr.springbootquickstart.services.TopicService;
import java.util.List;

@RestController
public class TopicController
{
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getById(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.add(topic);
    }
}
