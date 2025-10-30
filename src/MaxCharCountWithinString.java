import java.util.HashMap;
import java.util.Map;

public class MaxCharCountWithinString
{
    public static void main(String[] args)
    {
        String aWord = "ACCOMMODATION";

        Map<Character, Integer> wordMap = new HashMap<>();

        for (Character a : aWord.toCharArray())
        {
            wordMap.put(a, wordMap.getOrDefault(a, 1)+1);

        }


        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : wordMap.entrySet())
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
            }
        }

        for (Map.Entry<Character, Integer> entry1 : wordMap.entrySet())
        {
            if (entry1.getValue().equals(maxCount))
            {
                System.out.println("Max count character in given string is : " + entry1.getKey());
            }
        }

    }
}
