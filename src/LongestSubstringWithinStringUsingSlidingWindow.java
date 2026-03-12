import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithinStringUsingSlidingWindow
{
    public static void main(String[] args)
    {
        String myString = "kiranpawar";
        Map<String, Object> result = findLongestSubstring(myString);
        System.out.println("Input String: " + myString);
        System.out.println("Longest Substring: " + result.get("substring"));
        System.out.println("Length: " + result.get("length"));
    }

    public static Map<String, Object> findLongestSubstring(String str)
    {
        Map<Character, Integer> charToIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int longestSubstrStart = 0;
        int longestSubstrLength = 0;

        for (int end = 0; end < str.length(); end++)
        {
            char currentChar = str.charAt(end);

            // If the character is a repeat and is within the current window (start to end)
            if (charToIndexMap.containsKey(currentChar) && charToIndexMap.get(currentChar) >= start)
            {
                // Move the start of the window past the previous occurrence
                start = charToIndexMap.get(currentChar) + 1;
            }

            // Update the character's last seen index
            charToIndexMap.put(currentChar, end);

            // Calculate the current window length
            int currentLength = end - start + 1;

            // Update the maximum length and the starting position of the longest substring
            if (currentLength > maxLength)
            {
                maxLength = currentLength;
                longestSubstrStart = start;
                longestSubstrLength = currentLength;
            }
        }

        // Extract the actual longest substring
        String longestSubstring = str.substring(longestSubstrStart, longestSubstrStart + longestSubstrLength);

        Map<String, Object> result = new HashMap<>();
        result.put("substring", longestSubstring);
        result.put("length", longestSubstrLength);

        return result;
    }
}
