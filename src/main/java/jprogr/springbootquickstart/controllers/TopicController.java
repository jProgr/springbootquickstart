package jprogr.springbootquickstart.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
