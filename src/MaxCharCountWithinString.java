import java.util.HashMap;
import java.util.Map;

public class MaxCharCountWithinString
{
    public static void main(String[] args)
    {
        String aWord = "SILENCE";

        Map<Character, Integer> wordMap = new HashMap<>();

        for (Character a : aWord.toCharArray())
        {
            wordMap.put(a, wordMap.getOrDefault(a, 0)+1);

        }

        int maxCount = 0;
        char maxCountChar = ' ';

        for (Map.Entry<Character, Integer> entry : wordMap.entrySet())
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                maxCountChar = entry.getKey();
            }
        }

        System.out.println("Max count character in given string is : " + maxCountChar + " for the occurences : " + maxCount);
    }
}
