package jprogr.springbootquickstart.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Arrays;
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
        topics = Arrays.asList(
            new Topic(randomSource.getString(), randomSource.getString(), randomSource.getString()),
            new Topic(randomSource.getString(), randomSource.getString(), randomSource.getString())
        );
    }

    public List<Topic> getAllTopics()
    {
        return topics;
    }
}
