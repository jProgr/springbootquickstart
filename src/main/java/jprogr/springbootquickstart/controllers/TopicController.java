package jprogr.springbootquickstart.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import jprogr.springbootquickstart.entities.Topic;
import java.util.List;
import java.util.ArrayList;
import jprogr.springbootquickstart.util.RandomString;

@RestController
public class TopicController
{
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return getRandomTopics();
    }

    private List<Topic> getRandomTopics()
    {
        List<Topic> topics = new ArrayList();

        topics.add(
            new Topic(RandomString.get(), RandomString.get(), RandomString.get())
        );
        topics.add(
            new Topic(RandomString.get(), RandomString.get(), RandomString.get())
        );
        topics.add(
            new Topic(RandomString.get(), RandomString.get(), RandomString.get())
        );

        return topics;
    }
}
