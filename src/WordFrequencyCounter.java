import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequencyCounter
{
    public static void main(String[] args)
    {
        String input = "My yellow bag is on my yellow desk";        //output -> my:2, yellow:2, bag:1, is:1, on:1, desk:1,

        String[] words = input.split("\\s+");

        Map<String, Integer> wordCount = new LinkedHashMap<>();

// approach 1
        for (String word : words)
        {
            String wordToIgnoreCase = word.toLowerCase();

            wordCount.put(wordToIgnoreCase, wordCount.getOrDefault(wordToIgnoreCase, 0)+1);
        }

// approach 2
//        for (String word : words)
//        {
//            String wordToIgnoreCase = word.toLowerCase();
//
//            if (! wordCount.containsKey(wordToIgnoreCase))
//            {
//                wordCount.put(wordToIgnoreCase, 1);
//            }
//            else
//            {
//                wordCount.replace(wordToIgnoreCase, wordCount.get(wordToIgnoreCase)+1);
//            }
//        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet())
        {
            System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
        }
    }
}
