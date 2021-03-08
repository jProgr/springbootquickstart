package jprogr.springbootquickstart.util;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class RandomUtil
{
    private static String chars = "aceimnorsuvwxz";
    private static Random randomSource = new Random();

    public String getString()
    {
        StringBuilder randomString = new StringBuilder();
        int length = 10;

        for (int i = 0; i < length; i++)
        {
            randomString.append(
                chars.charAt(
                    randomSource.nextInt(
                        chars.length()
                    )
                )
            );
        }

        return randomString.toString();
    }
}
