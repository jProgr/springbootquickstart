package jprogr.springbootquickstart.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import jprogr.springbootquickstart.entities.Topic;
import jprogr.springbootquickstart.util.RandomUtil;
import javax.annotation.PostConstruct;

@Service
public class TopicService
{
    @Autowired
    private RandomUtil randomSource;

    private List<Topic> topics;

    @PostConstruct
    private void bootTopics()
    {
        topics = new ArrayList();

        topics.add(new Topic("a", randomSource.getString(), randomSource.getString()));
        topics.add(new Topic("b", randomSource.getString(), randomSource.getString()));
    }

    public List<Topic> getAllTopics()
    {
        return topics;
    }

    public Topic getById(String id)
    {
        return topics
            .stream()
            .filter(t -> t.getId().equals(id))
            .findFirst()
            .get();
    }

    public void add(Topic topic)
    {
        topics.add(topic);
    }
}
