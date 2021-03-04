package jprogr.springbootquickstart.util;

import java.util.Random;

public class RandomString
{
    private static String chars = "aceimnorsuvwxz";
    private static Random randomSource = new Random();

    public static String get()
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
