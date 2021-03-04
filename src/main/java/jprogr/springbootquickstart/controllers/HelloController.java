package jprogr.springbootquickstart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String sayHi()
    {
        return "OwO";
    }
}
